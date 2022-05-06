package com.swufe.se;

public class BankService {
    private Payment payment;
    public BankService(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void performPay(int amount) {
        System.out.println("Start to pay...");
        payment.pay(amount);
    }
}
