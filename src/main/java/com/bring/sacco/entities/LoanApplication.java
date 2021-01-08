package com.bring.sacco.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long loanApplicationId;

    @OneToOne
    private LoanType loanType;

    @ManyToOne
    @JoinColumn(name="accountId")
    private Account account;
    @OneToOne
    @JoinColumn(name = "loanStatusId")
    private LoanStatus loanStatus;

    @Basic
    private Date applicationDate;
    private int applicationAmount;
    private int approvedAmount;
    @Basic
    private Date approvalDate;
    private int minimumAmountPayed;
    private String repaymentPeriod;
    private int balance;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonBackReference(value="loanrepayment")
    @JoinColumn(name = "loanRepaymentId", nullable = false)
    private Set<LoanRepayment> loanRepayment = new HashSet<>();;

}
