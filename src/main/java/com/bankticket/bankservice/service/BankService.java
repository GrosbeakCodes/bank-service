package com.bankticket.bankservice.service;

import com.bankticket.bankservice.entity.Bank;

import java.util.List;

public interface BankService {
    Bank createBank(Bank bank);

    List<Bank> getAllBanks();

    Bank getBankById(Long id);

    Bank getBankByCode(String bankCode);

    Bank updateBank(Long id, Bank bank);

    void deleteBank(Long id);
}
