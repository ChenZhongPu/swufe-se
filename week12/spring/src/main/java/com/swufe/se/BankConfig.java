package com.swufe.se;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {

   @Bean
   public BankService bankService() {
      return new BankService(aliPay());
   }
   @Bean
   public Payment aliPay() {
      return new AliPay();
   }
}
