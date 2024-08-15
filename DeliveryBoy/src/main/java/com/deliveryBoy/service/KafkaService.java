package com.deliveryBoy.service;

import com.deliveryBoy.constants.KafkaConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class KafkaService {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    private final Logger logger = LoggerFactory.getLogger(KafkaService.class);

    /**
     * <p>This method is sending the message to kafka server with the help of {@link KafkaTemplate}</p>
    */
    public void updateLocation(String location) {
        Assert.notNull(location,"location can not be null.");
        kafkaTemplate.send(KafkaConstants.TOPIC_LOCATION_UPDATE,location);
        logger.info("Location Updated !");
    }
}
