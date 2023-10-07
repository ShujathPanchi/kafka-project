package com.endUser.consumer;

import com.endUser.constants.AppConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = AppConstants.LOCATION_UDPATE, groupId = AppConstants.GROUP_ID)
    public void updateLocation(String location){
        System.out.println(location);
    }
}
