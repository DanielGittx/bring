package com.bring.sacco.entities;

import javax.persistence.*;

@Entity
public class LoanType {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int maximumAmount;
    private int minimumAmount;
    private int maximumRepaymentPeriod;

    @OneToOne(mappedBy="loanType")
    private LoanApplication loanApplication;

    @OneToOne(mappedBy="loanType")
    private LoanApplication loanRepayment;

    public LoanType(long id, String name, int minimumAmount, int maximumAmount, int maximumRepaymentPeriod) {

        this.id = id;
        this.name = name;
        this.maximumAmount = maximumAmount;
        this.minimumAmount = minimumAmount;
        this.maximumRepaymentPeriod = maximumRepaymentPeriod;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(int maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public int getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(int minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public int getMaximumRepaymentPeriod() {
        return maximumRepaymentPeriod;
    }

    public void setMaximumRepaymentPeriod(int maximumRepaymentPeriod) {
        this.maximumRepaymentPeriod = maximumRepaymentPeriod;
    }
}
