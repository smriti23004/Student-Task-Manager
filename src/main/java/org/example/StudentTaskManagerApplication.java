package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // This tells Spring Boot to start here
public class StudentTaskManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentTaskManagerApplication.class, args);
    }
}