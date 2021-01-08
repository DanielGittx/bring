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
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountId;

    // bi-directional many-to-one association to Member (i.e Many Accounts to 1 Member)
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference(value="account")
    @JoinColumn(name = "memberId", nullable = false)
    private Member member;

    @OneToOne
    @JsonBackReference(value="accounttype")
    @JoinColumn(name = "accountTypeId", nullable = false)
    private AccountType accountType ;

    @Temporal(TemporalType.TIMESTAMP)
    private Date sqlTimestamp;

    private String accountStatus;
    private double accountBalance;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonBackReference(value="loanapplication")
    @JoinColumn(name = "loanApplicationId", nullable = false)
    private Set<LoanApplication> loanApplication = new HashSet<>();

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonBackReference(value="sharecapital")
    @JoinColumn(name = "shareCapitalId", nullable = false)
    private ShareCapital shareCapital;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonBackReference(value="transaction")
    @JoinColumn(name = "transactionId", nullable = false)
    private Set<Transaction> transaction = new HashSet<>();;






}
