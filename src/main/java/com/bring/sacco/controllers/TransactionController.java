package com.bring.sacco.controllers;


import com.bring.sacco.entities.Transaction;
import com.bring.sacco.entities.TransactionType;
import com.bring.sacco.exception_handlers.ResourceNotFoundException;
import com.bring.sacco.repositories.AccountRepository;
import com.bring.sacco.repositories.MemberRepository;
import com.bring.sacco.repositories.TransactionRepository;
import com.bring.sacco.services.TransactionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("transaction")
public class TransactionController {

    @Autowired
    TransactionRepository transactionRepository;
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    MemberRepository memberRepository;


    @PostMapping("/create")
    public Transaction createTransaction(@RequestBody Transaction transaction){

        // We need to carry out checks before we can persist data (Add checks for all the POST APIs   )
        if (!accountRepository.findById(transaction.getAccountId()).isPresent())
        {
            throw new ResourceNotFoundException("Account ID Does not exist");
        }

        if (!memberRepository.findById(transaction.getMemberId()).isPresent()) {

            throw new ResourceNotFoundException("Member ID Does not exist");
        }

        return transactionRepository.save(transaction);


    }

    @PutMapping("/update")
    public Transaction updateTransaction(@RequestBody Transaction transaction){

        return transactionRepository.save(transaction);

    }

    @GetMapping("/all")
    public List<Transaction> getAll(){
        return transactionRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable long id) {
        transactionRepository.deleteById(id);
    }


}

