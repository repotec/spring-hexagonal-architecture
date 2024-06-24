package com.ahd.hexagon.ports.driver;

import com.ahd.hexagon.dto.AccountDTO;

import java.util.List;

public interface CardDriverPort {

    List<AccountDTO> getAllCards();

    AccountDTO findCardById(Long CardId);

    AccountDTO saveCard(AccountDTO accountDTO);

    AccountDTO updateCard(AccountDTO accountDTO);

    void deleteById(Long CardId);
}
