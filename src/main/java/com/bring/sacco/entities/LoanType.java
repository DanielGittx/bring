package com.bring.sacco.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long loanTypeID;
    private String name;
    private int maximumAmount;
    private int minimumAmount;
    private int maximumRepaymentPeriod;

    @OneToOne(mappedBy="loanType")
    private LoanApplication loanApplication;

    @OneToOne(mappedBy="loanType")
    private LoanApplication loanRepayment;


}
