package com.transplace.tracking;


import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

@Configuration
public class ActiveMQConfig {

    public static final String FOURKITES_QUEUE = "fourkites.queue";
    public static final String MACROPOINT_QUEUE = "macropoint.queue";

    @Bean
    public Queue fourkitesQueue() {
        return new ActiveMQQueue(FOURKITES_QUEUE);
    }

    @Bean
    public Queue macropointQueue() {
        return new ActiveMQQueue(MACROPOINT_QUEUE);
    }
}
