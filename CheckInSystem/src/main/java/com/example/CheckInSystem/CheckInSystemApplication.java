package com.example.CheckInSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class CheckInSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckInSystemApplication.class, args);
	}

}

