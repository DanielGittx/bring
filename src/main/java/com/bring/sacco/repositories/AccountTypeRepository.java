package com.bring.sacco.repositories;

import com.bring.sacco.entities.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {
    List<AccountType> findAllById (long id);
    List<AccountType>findAllByName(String name);
    //    List<AccountType>findAllByAccount(long account);
    List<AccountType>findAllByIdAndName(long id, String name);




}