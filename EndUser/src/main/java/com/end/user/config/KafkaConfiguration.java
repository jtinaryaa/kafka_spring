package com.end.user.config;

import com.end.user.contants.KafkaConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author Jatin Arora
 *
 * <p>This class is created to show that how we can configure Kafka Cosumer</p>
 * <p>{@link KafkaListener} is the annocation which will call everytime automatically when any message
 * to the same topic will produce.</p>
 */
@Configuration
public class KafkaConfiguration {

    /*
    * Here in the below method we are using the KafkaLister annotation and in that annotation we are passing the
    * TOPIC name and Group also we need to define for consumer.
    */
    @KafkaListener(topics = KafkaConstants.TOPIC_LOCATION_UPDATE, groupId = KafkaConstants.GROUP_CONSUMER)
    public void updateLocation(String value) {
        System.out.println(value);
    }
}
