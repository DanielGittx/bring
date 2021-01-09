package com.bring.sacco.services;


import com.bring.sacco.entities.AccountType;
import com.bring.sacco.repositories.AccountTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountTypeService {
    private final AccountTypeRepository accountTypeRepository;


    public AccountTypeService(AccountTypeRepository accountTypeRepository) {
        this.accountTypeRepository =accountTypeRepository;
    }

    public AccountType createAccountType(AccountType accountType) {
        return accountTypeRepository.save(accountType);
    }

    public AccountType updateAccountType(AccountType accountType) {


        return accountTypeRepository.save(accountType);

    }

    public List<AccountType> getAll(){
        return accountTypeRepository.findAll();
    }

    public void deleteById(long id){ accountTypeRepository.deleteById(id);}




}
