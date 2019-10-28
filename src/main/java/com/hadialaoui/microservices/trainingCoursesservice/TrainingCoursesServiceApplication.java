package com.hadialaoui.microservices.trainingCoursesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TrainingCoursesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingCoursesServiceApplication.class, args);
	}

}
