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
    private long loanTypeId;
    private  long memberId;
    private long loanApplicationId;
    private Date repaymentDate;
    private int loanAmount;
    private int amountPayed;
    private int loanBalance;


}
