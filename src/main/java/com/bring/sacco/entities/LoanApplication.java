package com.bring.sacco.entities;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
public class LoanApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    private LoanType loanType;

    @ManyToOne
    @JoinColumn(name="accountId")
    private Account account;
    @OneToOne
    @JoinColumn(name = "loanStatusId")
    private LoanStatus loanStatus;

    @Basic
    private java.sql.Timestamp applicationDate;
    private int applicationAmount;
    private int approvedAmount;
    @Basic
    private java.sql.Timestamp approvalDate;
    private int minimumAmountPayed;
    private String repaymentPeriod;
    private int balance;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "loanApplicationId", referencedColumnName = "id")
    private Set<LoanRepayment> loanRepayment;

    public LoanApplication(long id, LoanType loanType, Account account,
                           LoanStatus loanStatus, java.sql.Timestamp applicationDate,
                           int applicationAmount,int approvedAmount, java.sql.Timestamp approvalDate,
                           int minimumAmountPayed,String repaymentPeriod, int balance ){

        this.id = id;
        this.loanType = loanType;
        this.account = account;
        this.loanStatus = loanStatus;
        this.applicationDate = applicationDate;
        this.applicationAmount = applicationAmount;
        this.approvalDate =approvalDate;
        this.approvedAmount = approvedAmount;
        this.minimumAmountPayed = minimumAmountPayed;
        this.repaymentPeriod = repaymentPeriod;
        this.balance = balance;

    }

    public Set<LoanRepayment> getLoanRepayment() {
        return loanRepayment;
    }

    public void setLoanRepayment(Set<LoanRepayment> loanRepayment) {
        this.loanRepayment = loanRepayment;
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public LoanStatus getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(LoanStatus loanStatus) {
        this.loanStatus = loanStatus;
    }

    public Timestamp getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Timestamp applicationDate) {
        this.applicationDate = applicationDate;
    }

    public int getApplicationAmount() {
        return applicationAmount;
    }

    public void setApplicationAmount(int applicationAmount) {
        this.applicationAmount = applicationAmount;
    }

    public int getApprovedAmount() {
        return approvedAmount;
    }

    public void setApprovedAmount(int approvedAmount) {
        this.approvedAmount = approvedAmount;
    }

    public Timestamp getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Timestamp approvalDate) {
        this.approvalDate = approvalDate;
    }

    public int getMinimumAmountPayed() {
        return minimumAmountPayed;
    }

    public void setMinimumAmountPayed(int minimumAmountPayed) {
        this.minimumAmountPayed = minimumAmountPayed;
    }

    public String getRepaymentPeriod() {
        return repaymentPeriod;
    }

    public void setRepaymentPeriod(String repaymentPeriod) {
        this.repaymentPeriod = repaymentPeriod;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
