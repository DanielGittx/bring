package com.bring.sacco.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="accountId")
    private Account account;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="memberId")
    private Member memberId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="transactionTypeId")
    private TransactionType transactionType;

    @Basic
    private java.sql.Timestamp transactionDate;
    private long accountNoTo;
    private long accountNoFrom;
    private int transactionAmount;

    public Transaction(long id, Account account, Member member, TransactionType
            transactionType, java.sql.Timestamp transactionDate, long accountNoTo,
                       long accountNoFrom, int transactionAmount){

        this.id= id;
        this.account = account;
        this.memberId = member;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.accountNoTo = accountNoTo;
        this.accountNoFrom =accountNoFrom;
        this.transactionAmount = transactionAmount;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Member getMemberId() {
        return memberId;
    }

    public void setMemberId(Member memberId) {
        this.memberId = memberId;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Timestamp getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }

    public long getAccountNoTo() {
        return accountNoTo;
    }

    public void setAccountNoTo(long accountNoTo) {
        this.accountNoTo = accountNoTo;
    }

    public long getAccountNoFrom() {
        return accountNoFrom;
    }

    public void setAccountNoFrom(long accountNoFrom) {
        this.accountNoFrom = accountNoFrom;
    }

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
