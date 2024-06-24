package com.ahd.hexagon.ports.driver.accounts.viewaccount;

import com.ahd.hexagon.clean.domain.scoring.Score;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class ViewAccountResponse {
    private String accountNumber;
    private String fullName;
    private int balance;
    private Score score;
}
