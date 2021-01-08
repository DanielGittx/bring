package com.bring.sacco.entities;

import javax.persistence.*;

@Entity
public class AccountType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;


    public AccountType(long id, String name){
        this.id = id;
        this.name = name;

    }
    public AccountType(){

    }



//    @OneToOne(mappedBy = "accountType", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    private Account account;


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

//    public Account getAccountId() {
//        return account;
//    }
//
//    public void setAccountId(Account accountId) {
//        this.account = accountId;
//    }
}
