package com.ahd.hexagon.ports.driven;

import com.ahd.hexagon.clean.domain.account.repository.AccountRepository;
import com.ahd.hexagon.ports.driver.accounts.openaccount.OpenAccountRequest;
import com.ahd.hexagon.ports.driver.accounts.openaccount.OpenAccountResponse;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class OpenAccountUseCase {

    private final AccountRepository bankAccountRepository;



    public OpenAccountUseCase(AccountRepository accountRepository) {
        this.bankAccountRepository = accountRepository;
    }

    public OpenAccountResponse handle(OpenAccountRequest request) {
        var nationalIdentityNumber = request.getNationalIdentityNumber();
        var accountHolderName = getAccountHolderName(request);
        var balance = getBalance(request);

        var timestamp = dateTimeService.now();

        var isBlacklisted = customerGateway.isBlacklisted(nationalIdentityNumber);

        if(isBlacklisted) {
            throw new ValidationException(ValidationMessages.NATIONAL_IDENTITY_NUMBER_BLACKLISTED);
        }

        var bankAccount = createBankAccount(nationalIdentityNumber, accountHolderName, balance, timestamp);

        // TODO: VC: Value object for national identity number
        var exists = nationalIdentityGateway.exists(nationalIdentityNumber);
        if(!exists) {
            throw new ValidationException(ValidationMessages.NATIONAL_IDENTITY_NUMBER_NONEXISTENT);
        }

        bankAccountRepository.add(bankAccount);

        var accountOpened = getAccountOpened(bankAccount, timestamp);
        eventPublisher.publishEvent(accountOpened);

        return getResponse(bankAccount);
    }

    private AccountHolderName getAccountHolderName(OpenAccountRequest request) {
        return AccountHolderName.of(request.getFirstName(), request.getLastName());
    }

    private Balance getBalance(OpenAccountRequest request) {
        return Balance.of(request.getBalance());
    }

    private BankAccount createBankAccount(String nationalIdentityNumber, AccountHolderName accountHolderName, Balance balance, LocalDateTime timestamp) {
        var accountId = bankAccountRepository.nextAccountId();
        var accountNumber = bankAccountRepository.nextAccountNumber();
        var openingDate = timestamp.toLocalDate();
        return new BankAccount(accountId, accountNumber, nationalIdentityNumber, accountHolderName, openingDate, balance);
    }

    private AccountOpened getAccountOpened(BankAccount bankAccount, LocalDateTime timestamp) {
        return new AccountOpened(timestamp, bankAccount.getAccountId(), bankAccount.getAccountHolderName(), bankAccount.getBalance());
    }

    private OpenAccountResponse getResponse(BankAccount bankAccount) {
        var accountNumber = bankAccount.getAccountNumber().toString();

        return OpenAccountResponse.builder()
                .accountNumber(accountNumber)
                .build();
    }
}
