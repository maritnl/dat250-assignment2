package no.hvl.dat250.jpa.basicexample;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    private Long number;
    private int limit;
    private int balance;
    @OneToOne
    private Pincode pincode;
    @ManyToOne
    @JoinColumn
    private Bank bank;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CreditCard [number=" + number + ", limit=" + limit
                + ", balance=" + balance + "]";
    }

}
