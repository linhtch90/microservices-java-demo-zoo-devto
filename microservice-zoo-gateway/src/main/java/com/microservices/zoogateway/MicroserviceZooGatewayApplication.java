package com.microservices.zoogateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceZooGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceZooGatewayApplication.class, args);
	}

}
