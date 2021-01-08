package com.bring.sacco.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transactionId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonBackReference(value="account")
    @JoinColumn(name = "accountId", nullable = false)
    private Account account;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference(value="member")
    @JoinColumn(name="memberId")
    private Member member;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference(value="transactionType")
    @JoinColumn(name ="transactionTypeId")
    private TransactionType transactionType;

    @Basic
    private Date transactionDate;
    private long accountNoTo;
    private long accountNoFrom;
    private int transactionAmount;

}
