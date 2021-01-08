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
@AllArgsConstructor
@NoArgsConstructor
public class LoanRepayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long loanRepaymentId;


    @OneToOne(cascade = CascadeType.ALL)
    @JsonBackReference(value="loantype")
    @JoinColumn(name = "loanTypeId", nullable = false)
    private LoanType loanType;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonBackReference(value="member")
    @JoinColumn(name = "memberId", nullable = false)
    private  Member member;

    @OneToOne
    @JsonBackReference(value="loanapplication")
    @JoinColumn(name = "loanApplicationId", nullable = false)
    private LoanApplication loanApplication;

    @Basic
    private Date repaymentDate;
    private int loanAmount;
    private int amountPayed;
    private int loanBalance;


}
