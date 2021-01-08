package com.bring.sacco.controllers;

import com.bring.sacco.entities.AccountType;
import com.bring.sacco.repositories.AccountTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account-type")
public class AccountTypeController {

@Autowired
    AccountTypeRepository accountTypeRepository;

    @PostMapping("/create")
    public AccountType createAccountType(@RequestBody AccountType accountType){
        return accountTypeRepository.save(accountType);
    }

    @PutMapping("/update")
    public AccountType updateAccountType(@RequestBody AccountType dto){
        return accountTypeRepository.save(dto);

    }

    @GetMapping("/all")
    public List<AccountType> getAll() {
        return accountTypeRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        accountTypeRepository.deleteById(id);
    }


}