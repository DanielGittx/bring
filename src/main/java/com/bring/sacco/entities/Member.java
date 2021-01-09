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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long memberId;

    private String fname;
    private String lname;
    private String email;
    private String photo;
    private String krapin;
    private int nationalId;
    private int phonenumber;
    private long shareCapitalId;
    private long transactionId;
    private long loanRepaymentId;


}
