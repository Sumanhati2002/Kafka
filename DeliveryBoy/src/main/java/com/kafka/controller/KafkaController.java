package com.kafka.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.service.Producer;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaController {

	@Autowired
	private Producer producer;
	
	@Autowired
	   KafkaController(Producer producer) {
	       this.producer = producer;
	   }
	
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam(value = "message",required = false) String message){
        producer.sendMessage(message);
        return ResponseEntity.ok("Message sent to kafka topic");
    }
}
