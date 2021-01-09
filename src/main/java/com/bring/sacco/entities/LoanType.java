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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long loanTypeId;
    private String name;
    private int maximumAmount;
    private int minimumAmount;
    private int maximumRepaymentPeriod;


}
