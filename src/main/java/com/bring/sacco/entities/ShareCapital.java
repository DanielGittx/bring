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

    @OneToOne(cascade = CascadeType.ALL)
    @JsonBackReference(value="member")
    @JoinColumn(name = "memberId", nullable = false)
    private Member member;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonBackReference(value="account")
    @JoinColumn(name = "accountId", nullable = false)
    private Account account;

    private int amountReceived;

}
