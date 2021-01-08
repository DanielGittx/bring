package com.bring.sacco.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class LoanRepayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn(name="loanTypeId")
    private LoanType loanType;

    @OneToOne
    @JoinColumn(name="memberId")
    private  Member memberId;

    @OneToOne
    @JoinColumn(name="loanApplicationId")
    private LoanApplication loanApplication;

    @Basic
    private java.sql.Timestamp repaymentDate;
    private int loanAmount;
    private int amountPayed;
    private int loanBalance;


    public LoanRepayment(long id, LoanType loanType, Member member,
                         LoanApplication loanApplication, java.sql.Timestamp repaymentDate,
                         int loanAmount, int amountPayed, int loanBalance){

        this.id=id;
        this.loanType=loanType;
        this.memberId =member;
        this.loanApplication=loanApplication;
        this.repaymentDate=repaymentDate;
        this.loanAmount=loanAmount;
        this.amountPayed= amountPayed;
        this.loanBalance=loanBalance;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public Member getMemberId() {
        return memberId;
    }

    public void setMemberId(Member memberId) {
        this.memberId = memberId;
    }

    public LoanApplication getLoanApplication() {
        return loanApplication;
    }

    public void setLoanApplication(LoanApplication loanApplication) {
        this.loanApplication = loanApplication;
    }

    public Timestamp getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Timestamp repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getAmountPayed() {
        return amountPayed;
    }

    public void setAmountPayed(int amountPayed) {
        this.amountPayed = amountPayed;
    }

    public int getLoanBalance() {
        return loanBalance;
    }

    public void setLoanBalance(int loanBalance) {
        this.loanBalance = loanBalance;
    }
}
