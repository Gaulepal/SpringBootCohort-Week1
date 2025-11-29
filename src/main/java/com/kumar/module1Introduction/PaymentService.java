package com.kumar.module1Introduction;

import org.springframework.stereotype.Service;

//@Component // 👈
@Service
public class PaymentService {
  public void pay() {
    System.out.println("Paying...");
  }
}
