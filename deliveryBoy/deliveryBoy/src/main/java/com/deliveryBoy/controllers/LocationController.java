package com.deliveryBoy.controllers;

import com.deliveryBoy.services.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping(value = "/location")
@RestController
public class LocationController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping(value = "/update")
    public ResponseEntity<?> updateLocation(){
        for(int i=1; i<=200000; i++) {
            this.kafkaProducer.updateLocation("(" + Math.round(Math.random() * 100) + ") "+", (" + Math.round(Math.random() * 100) + ")");
        }
        return new ResponseEntity<>(Map.of("Message", "Location updated"), HttpStatus.OK);
    }
}
