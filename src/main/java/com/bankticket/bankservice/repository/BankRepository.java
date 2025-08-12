package com.bankticket.bankservice.repository;

import com.bankticket.bankservice.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

    Optional<Bank> findByBankName(String bankName);

    Optional<Bank> findByBankCode(String bankCode);

    boolean existsByBankCode(String bankCode);

    boolean existsByBankName(String bankName);
}
