package com.deliveryBoy.services;

import com.deliveryBoy.constants.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private Logger log = LoggerFactory.getLogger(KafkaProducer.class);

    public void updateLocation(String location){
        this.kafkaTemplate.send(AppConstants.LOCATION_UPDATE, location);
        System.out.println("Message Updated");
    }
}
