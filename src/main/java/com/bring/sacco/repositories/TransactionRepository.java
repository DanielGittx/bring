package com.bring.sacco.repositories;

import com.bring.sacco.entities.Account;
import com.bring.sacco.entities.Member;
import com.bring.sacco.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findAllById(long id);
    List<Transaction>findAllByAccount(Account account);
    List<Transaction>findAllByMemberId(Member member);
//    List<Transaction>findAllByTransactionType(TransactionType transactionType);
//    List<Transaction>findAllByTransactionDate(Timestamp transactionDate);
//    List<Transaction>findAllByAccountNoTo(long accountNoTo);
//    List<Transaction>findAllByAccountNoFrom(long accountNoFrom);
//    List<Transaction>findAllByTransactionAmount(int transactionAmount);
}