package com.example.old;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OldApplication {

    public static void main(String[] args) {
        SpringApplication.run(OldApplication.class, args);
        System.out.println("hello");
    }

}
