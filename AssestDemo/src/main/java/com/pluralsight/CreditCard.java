package com.pluralsight;

public class CreditCard {
    private double balance;

    public void pay(double amount){
        balance += amount;
    }

    public void charge(double amount){
        balance -= amount;
    }

    public double getValue(){
        return balance;
    }

}
