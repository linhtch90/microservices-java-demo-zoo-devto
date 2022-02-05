package com.microservices.zooeurekasvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceZooServicesDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceZooServicesDiscoveryApplication.class, args);
	}

}
