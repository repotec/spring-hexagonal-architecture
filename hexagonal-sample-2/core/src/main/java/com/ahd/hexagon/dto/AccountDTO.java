package com.ahd.hexagon.dto;

public record AccountDTO(
        String cardNumber,
        String holderName,
        String cvv
) {
}
