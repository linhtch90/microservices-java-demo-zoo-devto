package com.microservices.zooconfsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceZooConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceZooConfigServerApplication.class, args);
	}

}
