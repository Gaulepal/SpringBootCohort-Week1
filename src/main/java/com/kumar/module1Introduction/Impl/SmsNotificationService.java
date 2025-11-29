package com.kumar.module1Introduction.Impl;

import com.kumar.module1Introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

//@Primary
@Component
@Qualifier("smsQualifier")
@ConditionalOnProperty(name = "notification.type", havingValue = "sms")
public class SmsNotificationService implements NotificationService {
  @Override
  public void send(String message) {
    System.out.println("Sending SMS..." + message);
  }
}
