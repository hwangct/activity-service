package com.pointtracker.activityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ActivityServiceApplication {
    public static void main(String args[]) {
        ConfigurableApplicationContext run = SpringApplication.run(ActivityServiceApplication.class, args);
    }
}
