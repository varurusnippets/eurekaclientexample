package com.example.eurekaclientexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableEurekaClient

public class EurekaclientexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientexampleApplication.class, args);
	}

//	@Bean
////	@LoadBalanced
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//	}
}
