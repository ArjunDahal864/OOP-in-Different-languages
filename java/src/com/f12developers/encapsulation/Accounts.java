package com.f12developers.encapsulation;

public class Accounts {
    // Field
    private float balance;


    // methods
    public void deposit(float amount){
        if(amount > 0)
            balance += amount;
    }
    public void withdraw(float amount){
        if (amount > 0)
            balance -= amount;
    }

    public float getBalance() {
        return balance;
    }
}
