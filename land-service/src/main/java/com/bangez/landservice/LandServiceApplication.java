package com.bangez.landservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LandServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LandServiceApplication.class, args);
    }

}
