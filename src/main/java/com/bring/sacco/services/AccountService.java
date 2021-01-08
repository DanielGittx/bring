package com.bring.sacco.services;

import com.bring.sacco.entities.Account;
import com.bring.sacco.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    //crud
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account updateAccount(Account dto)
    {
        return accountRepository.save(dto);
    }
    public List<Account> getAll()
    {
        return accountRepository.findAll();
    }
    public void deleteById(long id)
    {
        accountRepository.findById(id);
    }




}
