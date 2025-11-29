package com.kumar.module1Introduction;

import org.springframework.context.annotation.Bean;

public class AppConfig {

  @Bean
    // use constructor to create an obj
  PaymentService paymentService() {
    return new PaymentService();
  }
}
