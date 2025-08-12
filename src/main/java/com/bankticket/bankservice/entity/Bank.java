package com.bankticket.bankservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "banks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Unique ID for the bank

    @Column(nullable = false, unique = true)
    private String bankName; // Name of the bank

    @Column(nullable = false, unique = true)
    private String bankCode; // Unique short code for the bank (e.g., SBI001)

    private String address; // Bank address

    private String contactEmail; // Contact email of the bank

    private String contactPhone; // Contact phone number of the bank

    private boolean active; // Bank status (active/inactive)
}
