package com.bankticket.bankservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankDTO {
    private Long id;
    private String bankName;
    private String bankCode;
    private String address;
    private String contactEmail;
    private String contactPhone;
    private boolean active;
}
