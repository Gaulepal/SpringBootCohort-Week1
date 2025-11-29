package com.kumar.module1Introduction.Impl;

import com.kumar.module1Introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emailQualifier")
public class EmailNotificationService implements NotificationService {
  @Override
  public void send(String message) {
    System.out.println("Sending email..." + message);
  }
}
