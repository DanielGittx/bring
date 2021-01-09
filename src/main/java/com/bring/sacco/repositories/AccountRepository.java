package com.bring.sacco.repositories;

import com.bring.sacco.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> findAllById(long accountId);
    //    List<Account>findAllByMember(Member member);
    //List<Account>findAllByAccountType(AccountType accountType);
    List<Account>findAllBySqlTimestamp(Date timeStamp);
    List<Account>findAllByAccountStatus(String accountStatus);
    List<Account>findAllByAccountNumber(long accountNumber);
    List<Account>findAllByAccountBalance(int accountBalance);


}