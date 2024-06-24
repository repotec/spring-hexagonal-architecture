package com.ahd.hexagon.clean.domain.scoring;

import com.optivem.kata.banking.core.internal.cleanarch.domain.accounts.BankAccount;

public interface FactorAggregator {
    int aggregate(BankAccount bankAccount);
}
