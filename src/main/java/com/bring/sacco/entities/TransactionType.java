package com.bring.sacco.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transactionTypeId;
    private String name;

    @OneToMany(mappedBy="transactionType", cascade = CascadeType.ALL)
    private Set<Transaction> transactions = new HashSet<>();

}
