package com.transplace.tracking;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class InboundProducer {

    public Message<?> send(Message<?> msg) {

        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        org.apache.kafka.clients.producer.Producer<String, String> producer = new KafkaProducer<>(props);
        producer.send(new ProducerRecord<String, String>((String)msg.getHeaders().get("KAFKA-TOPIC"), "Hi", msg.getPayload().toString()));
        producer.close();

        return msg;
    }


}
