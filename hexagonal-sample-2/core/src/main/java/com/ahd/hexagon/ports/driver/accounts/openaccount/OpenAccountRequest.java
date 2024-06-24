package com.ahd.hexagon.ports.driver.accounts.openaccount;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class OpenAccountRequest {
    private String nationalIdentityNumber;
    private String firstName;
    private String lastName;
    private int balance;
}
