package com.bankticket.bankservice.service;

import com.bankticket.bankservice.entity.Bank;
import com.bankticket.bankservice.repository.BankRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    private final BankRepository bankRepository;

    public BankServiceImpl(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @Override
    public Bank createBank(Bank bank) {
        return bankRepository.save(bank);
    }

    @Override
    public List<Bank> getAllBanks() {
        return bankRepository.findAll();
    }

    @Override
    public Bank getBankById(Long id) {
        return bankRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bank not found with id: " + id));
    }

    @Override
    public Bank getBankByCode(String bankCode) {
        return bankRepository.findByBankCode(bankCode)
                .orElseThrow(() -> new RuntimeException("Bank not found with code: " + bankCode));
    }

    @Override
    public Bank updateBank(Long id, Bank bank) {
        Bank existingBank = getBankById(id);
        existingBank.setBankName(bank.getBankName());
        existingBank.setBankCode(bank.getBankCode());
        existingBank.setAddress(bank.getAddress());
        existingBank.setContactEmail(bank.getContactEmail());
        existingBank.setContactPhone(bank.getContactPhone());
        existingBank.setActive(bank.isActive());
        return bankRepository.save(existingBank);
    }

    @Override
    public void deleteBank(Long id) {
        bankRepository.deleteById(id);
    }
}
