package com.bring.sacco.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountId;
    private long memberId;
    private long accountTypeId;
    private Date sqlTimestamp;
    private String accountNumber;
    private String accountStatus;
    private int accountBalance;
    private long loanApplicationId;
    private long shareCapitalId;
    private long transactionId;

}