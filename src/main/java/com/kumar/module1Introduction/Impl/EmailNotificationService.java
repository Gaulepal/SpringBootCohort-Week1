package com.kumar.module1Introduction.Impl;

import com.kumar.module1Introduction.NotificationService;

public class EmailNotificationService implements NotificationService {
  @Override
  public void send(String message) {
    System.out.println("Sending email..." + message);
  }
}
