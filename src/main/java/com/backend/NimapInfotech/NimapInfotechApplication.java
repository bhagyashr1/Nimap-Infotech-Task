package com.backend.NimapInfotech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "NimapInfotech")
@EnableJpaRepositories(basePackages = "NimapInfotech.repository")
@EntityScan(basePackages = "NimapInfotech.entity")
public class NimapInfotechApplication {
    public static void main(String[] args) {
        SpringApplication.run(NimapInfotechApplication.class, args);
    }
}

