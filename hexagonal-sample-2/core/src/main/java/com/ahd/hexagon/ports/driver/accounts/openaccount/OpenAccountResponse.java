package com.ahd.hexagon.ports.driver.accounts.openaccount;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class OpenAccountResponse {
    private String accountNumber;
}
