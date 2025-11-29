package com.kumar.module1Introduction;

import org.springframework.context.annotation.Bean;

public class AppConfig {

  @Bean
    // use constructor to create an obj
  PaymentService paymentService() {
    // we can add more logic
    return new PaymentService();
  }
}
