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
    private long loanApplicationId;
    private long loanTypeId;
    private long accountId;
    private long loanStatusId;
    private Date applicationDate;
    private int applicationAmount;
    private int approvedAmount;
    private Date approvalDate;
    private int minimumAmountPayed;
    private String repaymentPeriod;
    private int balance;
    private long loanRepaymentId;

}
