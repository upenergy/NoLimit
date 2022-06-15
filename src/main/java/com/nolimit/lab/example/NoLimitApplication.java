package com.nolimit.lab.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan("com.nolimit")
public class NoLimitApplication {
    public static void main(String[] args) {
        SpringApplication.run(NoLimitApplication.class, args);
    }
}
