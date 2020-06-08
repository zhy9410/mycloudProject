package com.raise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoginConsumerApplication.class, args);
        System.out.println("-----------------登录消费方启动-----------------");
    }
}
