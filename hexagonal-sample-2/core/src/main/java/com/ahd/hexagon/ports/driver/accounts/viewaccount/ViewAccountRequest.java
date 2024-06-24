package com.ahd.hexagon.ports.driver.accounts.viewaccount;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class ViewAccountRequest {
    private String accountNumber;
}
