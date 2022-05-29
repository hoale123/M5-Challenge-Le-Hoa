package com.company.CatalogMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CatalogMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogMicroserviceApplication.class, args);
	}

}
