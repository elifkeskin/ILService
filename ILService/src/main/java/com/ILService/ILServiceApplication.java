package com.ILService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan({"com.server", "com.server.config"})
@EnableMongoRepositories("com.server.repository")
public class ILServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ILServiceApplication.class, args);
    }
}