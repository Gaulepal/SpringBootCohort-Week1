package com.kumar.module1Introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

  // DI inject the service with @Autowired
  @Autowired
  PaymentService paymentService;

  @Autowired
  PaymentService paymentService2;

  public static void main(String[] args) {
    SpringApplication.run(Module1IntroductionApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    // compare two objects
    System.out.println(paymentService.hashCode());
    System.out.println(paymentService2.hashCode());

    // call the payment service
    paymentService.pay();
  }
}


