package com.example.demo;

import org.bson.internal.BsonUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Citazap{
    public static void main(String[] args) {
        SpringApplication.run(Citazap.class, args);
    }
    @GetMapping("/")
    public String apiRoot() {
        return "Bienvenido a Citazap";
    }
}
