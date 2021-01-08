package com.bring.sacco.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    private Long loanTypeID;

    private String name;
    private Double maximumAmount;
    private Double minimumAmount;
    private Double maximumRepaymentPeriod;
/*
    @OneToOne
    @JsonBackReference(value="loanapplication")
    @JoinColumn(name = "loanApplicationId", nullable = false)
    private LoanApplication loanApplication;

    @OneToOne
    @JsonBackReference(value="loanrepayment")
    @JoinColumn(name = "loanRepaymentId", nullable = false)
    private LoanRepayment loanRepayment;
*/

}
