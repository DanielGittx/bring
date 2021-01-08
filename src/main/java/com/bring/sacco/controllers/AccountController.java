package com.bring.sacco.controllers;

import com.bring.sacco.entities.Account;
import com.bring.sacco.repositories.AccountRepository;
import com.bring.sacco.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;



    @PostMapping("/create")
    public Account createAccount(@RequestBody Account account){
        System.out.println("Test Account create");
        return accountService.createAccount(account);
    }

    @PutMapping("/update")
    public Account updateAccount(@RequestBody Account dto){
        return accountService.updateAccount(dto);

    }

    @GetMapping("/all")
    public List<Account> getAll() {
        return accountService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id) {
        accountService.deleteById(id);
    }


}
