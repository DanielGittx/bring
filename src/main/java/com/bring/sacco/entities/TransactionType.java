package com.bring.sacco.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class TransactionType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @OneToMany(mappedBy="transactionType", cascade = CascadeType.ALL)
    private Set<Transaction> transactions = new HashSet<>();

    public TransactionType(long id, String name){
        this.id = id;
        this.name = name;

    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
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
}
