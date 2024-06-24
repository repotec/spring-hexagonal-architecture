package com.ahd.hexagon.clean.domain.account.valueobjects;

public record AccountId(long value) {

    public static AccountId of(long value) {
        //guards and validations ...
        return new AccountId(value);
    }
    public long toLong() {
        return value;
    }
}
