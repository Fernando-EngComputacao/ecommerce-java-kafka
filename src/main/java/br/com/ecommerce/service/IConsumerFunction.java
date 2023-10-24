package br.com.ecommerce.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface IConsumerFunction {
    void consume(ConsumerRecord<String, String> recordM);
}
