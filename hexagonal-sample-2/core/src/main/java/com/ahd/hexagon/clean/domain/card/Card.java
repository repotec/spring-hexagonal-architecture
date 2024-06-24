package com.ahd.hexagon.clean.domain.card;

import java.time.LocalDate;

public record Card (
        Long cardNumber,
        String holderName,
        String cvv
) { }