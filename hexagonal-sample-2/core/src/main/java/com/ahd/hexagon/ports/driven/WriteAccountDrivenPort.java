package com.ahd.hexagon.ports.driven;

import com.ahd.hexagon.dto.AccountDTO;

public interface WriteAccountDrivenPort {

    AccountDTO saveAccount(AccountDTO Account);

    AccountDTO updateAccount(AccountDTO Account);

    void deleteById(Long AccountId);
}
