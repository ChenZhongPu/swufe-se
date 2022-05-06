package com.swufe.se;

public class AliPay implements Payment {
    @Override
    public void pay(int amount) {
        System.out.printf("Pay with %d AliPay", amount);
    }
}
