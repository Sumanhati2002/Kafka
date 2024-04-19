package com.kafka.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.service.appconstant.AppConstants;

@Service
public class Producer {

	private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);
	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMessage(String message){
        LOGGER.info(String.format("Message sent -> %s", message));
        kafkaTemplate.send(AppConstants.TOPIC_NAME, message);
    }
}
