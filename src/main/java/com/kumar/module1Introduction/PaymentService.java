package com.kumar.module1Introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

//@Component // 👈
@Service
public class PaymentService {
  public void pay() {
    System.out.println("Paying...");
  }

  @PostConstruct
  public void afterInitialize() {
    System.out.println("afterInitialize...");
  }

  @PreDestroy
  public void beforeDestroy() {
    System.out.println("beforeDestroy...");
  }
}
