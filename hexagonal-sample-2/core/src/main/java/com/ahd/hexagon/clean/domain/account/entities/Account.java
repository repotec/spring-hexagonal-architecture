package com.ahd.hexagon.clean.domain.account.entities;

import java.time.LocalDate;

public record Account(
        Long accountNumber,
        String firstName,
        String lastName
) {
}
