package com.ahd.hexagon.ports.driver.accounts.withdrawfunds;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class WithdrawFundsRequest {
    private String accountNumber;
    private int amount;
}
