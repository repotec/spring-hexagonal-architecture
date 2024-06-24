package com.ahd.hexagon.ports.driven;

import com.ahd.hexagon.dto.AccountDTO;

import java.util.List;
import java.util.Optional;

// AccountId value Object instead of Long
public interface ReadAccountDrivenPort {
    AccountDTO  findAccountById(Long AccountId);
}
