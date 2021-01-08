package com.bring.sacco.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanApplicationId;
    private Long loanTypeId;
    private Long accountId;
    private Long loanStatusId;
    private Long LoanRepaymentId;

    /*
    @OneToOne
    @JsonBackReference(value="loantype")
    @JoinColumn(name = "loanTypeId", nullable = false)
    private LoanType loanType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference(value="account")
    @JoinColumn(name = "accountId", nullable = false)
    private Account account;

    @OneToOne
    @JsonBackReference(value="loanstatus")
    @JoinColumn(name = "loanStatusId", nullable = false)
    private LoanStatus loanStatus;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonBackReference(value="loanrepayment")
    @JoinColumn(name = "loanRepaymentId", nullable = false)
    private Set<LoanRepayment> loanRepayment ;

    */

    private Date applicationDate;
    private Date approvalDate;
    private Double applicationAmount;
    private Double approvedAmount;

    private Double minimumAmountPayed;
    private String repaymentPeriod;
    private Double balance;



}
