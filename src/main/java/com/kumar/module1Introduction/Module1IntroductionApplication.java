package com.kumar.module1Introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

  // field Injection is not recommended -> so remove @Autowired //  @Autowired
//  final NotificationService notificationService;
//
//  // make the construction this class
//  public Module1IntroductionApplication(NotificationService notificationService) {
//    this.notificationService = notificationService;
//  }

  // get all the implementation of the NotificationService
  @Autowired
  Map<String, NotificationService> notificationServiceMap = new HashMap<>();

  public static void main(String[] args) {
    SpringApplication.run(Module1IntroductionApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

//    notificationService.send("bonjour!");
//    smsNotificationService.send("bonjour");

    // forEach
    for (var notificationService : notificationServiceMap.entrySet()) {
      System.out.println("notification services " + notificationService.getKey());
      notificationService.getValue().send("namaste!");
    }
  }
}


