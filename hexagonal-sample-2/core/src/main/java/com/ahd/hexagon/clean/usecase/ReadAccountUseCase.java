package com.ahd.hexagon.clean.usecase;

import com.ahd.hexagon.clean.domain.account.repository.AccountRepository;
import com.ahd.hexagon.dto.AccountDTO;
import com.ahd.hexagon.ports.driven.ReadAccountDrivenPort;

import java.util.List;
import java.util.Optional;

public class ReadAccountUseCase implements ReadAccountDrivenPort {


    @Override
    public AccountDTO findAccountById(Long AccountId) {
        return null;
    }
}
