package com.swufe.se;

public class AliPay implements Payment {
    @Override
    public boolean pay(int amount) {
        System.out.printf("Pay with %d AliPay", amount);
        return true;
    }
}
