package com.ahd.hexagon.clean.domain.account.valueobjects;

public record AccountNumber(String value) {

    public AccountNumber {
        //guards and validations ...
    }

    public static AccountNumber of(String value) {
        return new AccountNumber(value);
    }
}