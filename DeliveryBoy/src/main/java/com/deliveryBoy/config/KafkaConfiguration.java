package com.deliveryBoy.config;

import com.deliveryBoy.constants.KafkaConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author Jatin Arora
 *
 * <p>This class is created to show that how we can configure the Kafka.</p>
 * <p>In this configuration class I have created a Bean of {@link NewTopic}</p>
 *
 */
@Configuration
public class KafkaConfiguration {

    /*
     * In the below we are creating the one new topic with topic name.
     */
    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(KafkaConstants.TOPIC_LOCATION_UPDATE).build();
    }
}
