package com.ahd.hexagon.ports.driver.accounts.depositfunds;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class DepositFundsRequest  {
    private String accountNumber;
    private int amount;
}
