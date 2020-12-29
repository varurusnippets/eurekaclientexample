package com.example.eurekaclientexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	@KafkaListener(topics = "test", groupId = "test-consumer-group")
	public void listen(String message) {
		System.out.println("Kafka Listenere" + message);
	}
}
