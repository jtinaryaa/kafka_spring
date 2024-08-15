package com.deliveryBoy.controller;

import com.deliveryBoy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LocationController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update-location")
    public ResponseEntity<?> updateLocation() {
        String location = "["+Math.round(Math.random()*100)+","+Math.round(Math.random()*100)+"]";
        kafkaService.updateLocation(location);
        return ResponseEntity.ok(Map.of("message","location updated"));
    }
}
