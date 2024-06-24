package com.ahd.hexagon.clean.usecase;

import com.ahd.hexagon.dto.AccountDTO;

public interface WriteAccountUseCase {

    AccountDTO saveAccount(AccountDTO account);

    AccountDTO updateAccount(AccountDTO account);

    void deleteById(Long employeeId);
}
