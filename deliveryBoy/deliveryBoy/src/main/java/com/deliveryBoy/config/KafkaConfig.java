package com.deliveryBoy.config;

import com.deliveryBoy.constants.AppConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    public NewTopic kafkaTopic(){

        return TopicBuilder.name(AppConstants.LOCATION_UPDATE).build();
    }
}
