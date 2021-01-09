package com.bring.sacco.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShareCapital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long shareCapitalId;
    private long memberId;
    private long accountId;
    private int amountReceived;

}
