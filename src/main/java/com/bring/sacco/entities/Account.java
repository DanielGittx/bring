package com.bring.sacco.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="memberId")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private  long memberId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="accountTypeId")
    private AccountType accountType;

    @Basic
    private java.sql.Timestamp sqlTimestamp;
    private String accountStatus;
    private int accountBalance;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "accountId", referencedColumnName = "id")
    private Set<LoanApplication> loanApplication = new HashSet<>();

    @OneToOne(mappedBy="accountId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ShareCapital shareCapital;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "accountId", referencedColumnName = "id")
    private Set<Transaction> transaction = new HashSet<>();


    public Account(long id, long memberId, AccountType accountType, Timestamp sqlTimestamp, String accountStatus, int accountBalance) {
        this.id = id;
        this.memberId = memberId;
        this.accountType = accountType;
        this.sqlTimestamp = sqlTimestamp;
        this.accountStatus = accountStatus;
        this.accountBalance = accountBalance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public Set<LoanApplication> getLoanApplication() {
        return loanApplication;
    }

    public void setLoanApplication(Set<LoanApplication> loanApplication) {
        this.loanApplication = loanApplication;
    }

    public Set<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(Set<Transaction> transaction) {
        this.transaction = transaction;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Timestamp getSqlTimestamp() {
        return sqlTimestamp;
    }

    public void setSqlTimestamp(Timestamp sqlTimestamp) {
        this.sqlTimestamp = sqlTimestamp;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
}
