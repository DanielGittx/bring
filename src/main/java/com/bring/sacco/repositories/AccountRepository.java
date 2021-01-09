package com.bring.sacco.repositories;

import com.bring.sacco.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {



}