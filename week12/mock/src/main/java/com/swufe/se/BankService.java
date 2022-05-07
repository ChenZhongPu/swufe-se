package com.swufe.se;

public class BankService {
    private final Payment payment;

    public BankService(Payment payment) {
        this.payment = payment;
    }

    public boolean performPay(int amount) {
        System.out.println("Start to pay...");
        return payment.pay(amount);
    }
}
