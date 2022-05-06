package com.swufe.se;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(BankConfig.class)) {
            BankService service = context.getBean("bankService", BankService.class);
            service.performPay(42);
        }
    }
}
