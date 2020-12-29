//package com.example.eurekaclientexample;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//@Component
//class RestTemplateExample implements CommandLineRunner {
//
//	@Autowired
//	RestTemplate restTemplate;
//
//	@Override
//	public void run(String... strings) throws Exception {
//		// use the "smart" Eureka-aware RestTemplate
//		System.out.println("###############################################################");
////		http://localhost:8080/first
//		List response = (List) restTemplate.getForObject("http://firstspringboot/first", List.class);
////		ResponseEntity<String> exchange = restTemplate.exchange("http://FIRSTSPRINGBOOT/actuator/info", HttpMethod.GET,
////				null, String.class);
//
//		response.forEach(System.out::println);
//	}
//
//}