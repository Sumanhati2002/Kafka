package com.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.kafka.service.appconstant.AppConstants;

@Configuration
public class Topic {

	 @Bean
	    public NewTopic javaguidesTopic(){
	        return TopicBuilder.name(AppConstants.TOPIC_NAME)
	                .build();
	    }
}
