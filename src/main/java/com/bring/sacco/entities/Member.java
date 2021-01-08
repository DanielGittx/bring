package com.bring.sacco.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long memberId;
    private String fname;
    private String lname;
    private String email;
    private String photo;
    private String krapin;
    private int nationalId;
    private int phonenumber;


    @OneToOne(mappedBy="memberId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ShareCapital shareCapital;

    @OneToMany(mappedBy = "memberId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Transaction> transaction = new HashSet<>();

    @OneToMany(mappedBy = "memberId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<LoanRepayment> loanRepayment = new HashSet<>();

    public Member() {

    }

    public Member(long memberId, String fname, String lname, String email, String photo, String krapin, int nationalId, int phonenumber) {
        this.memberId = memberId;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.photo = photo;
        this.krapin = krapin;
        this.nationalId = nationalId;
        this.phonenumber = phonenumber;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getKrapin() {
        return krapin;
    }

    public void setKrapin(String krapin) {
        this.krapin = krapin;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public ShareCapital getShareCapital() {
        return shareCapital;
    }

    public void setShareCapital(ShareCapital shareCapital) {
        this.shareCapital = shareCapital;
    }

    public Set<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(Set<Transaction> transaction) {
        this.transaction = transaction;
    }

    public Set<LoanRepayment> getLoanRepayment() {
        return loanRepayment;
    }

    public void setLoanRepayment(Set<LoanRepayment> loanRepayment) {
        this.loanRepayment = loanRepayment;
    }
}
