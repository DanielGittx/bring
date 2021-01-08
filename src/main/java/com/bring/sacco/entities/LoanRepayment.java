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
    private Long loanRepaymentId;
/*

    @OneToOne(cascade = CascadeType.ALL)
    @JsonBackReference(value="loantype")
    @JoinColumn(name = "loantypeid", referencedColumnName = "loanTypeId", nullable = false)
    private LoanType loanType;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonBackReference(value="member")
    @JoinColumn(name = "memberid",referencedColumnName = "memberId", nullable = false)
    private Member member;

    @OneToOne
    @JsonBackReference(value="loanapplication")
    @JoinColumn(name = "loanapplicationid", referencedColumnName = "loanApplicationId",nullable = false)
    private LoanApplication loanApplication;
*/
    private Date repaymentDate;
    private Double loanAmount;
    private Double amountPayed;
    private Double loanBalance;


}
