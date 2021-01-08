package com.bring.sacco.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long memberId;
    private String firstName;
    private String lastName;
    private String email;
    private String photo;
    private String kraPin;
    private int nationalId;
    private int phoneNumber;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonBackReference(value="sharecapital")
    @JoinColumn(name = "shareCapitalId", nullable = false)
    private ShareCapital shareCapital;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonBackReference(value="transaction")
    @JoinColumn(name = "transactionId", nullable = false)
    private Set<Transaction> transaction = new HashSet<>();


    @OneToOne(fetch = FetchType.EAGER)
    @JsonBackReference(value="loanrepayment")
    @JoinColumn(name = "loanRepaymentId", nullable = false)
    private Set<LoanRepayment> loanRepayment ;

}
