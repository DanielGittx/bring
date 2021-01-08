package com.bring.sacco.entities;

import javax.persistence.*;

@Entity
public class ShareCapital {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="memberId")
    private Member memberId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="accountId")
    private Account accountId;
    private int amountReceived;


    public ShareCapital(long id, Member memberId, Account accountId, int amountReceived){

        this.id = id;
        this.memberId = memberId;
        this.accountId = accountId;
        this.amountReceived = amountReceived;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Member getMemberId() {
        return memberId;
    }

    public void setMemberId(Member memberId) {
        this.memberId = memberId;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public int getAmountReceived() {
        return amountReceived;
    }

    public void setAmountReceived(int amountReceived) {
        this.amountReceived = amountReceived;
    }
}
