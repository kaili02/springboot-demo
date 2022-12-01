package com.example.kafka.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created By kaili
 * Date: 2019/12/11
 * Description: TODO
 */
@Component
@Slf4j
public class KafkaMessageReceiver {
    //指定监听的topic，当前消费者组id
    @KafkaListener(topics = {"test"}, groupId = "receiver")
    public void registryReceiver(ConsumerRecord<String, String> consumerRecords) {
        log.info("registryReceiver-----------"+consumerRecords.value());
    }

    //指定监听的topic，当前消费者组id
    @KafkaListener(topics = {"test"}, groupId = "receiver2")
    public void registryReceiver2(ConsumerRecord<String, String> consumerRecords) {
        log.info("registryReceiver2-----------"+consumerRecords.value());
    }

    /**
     * 同一个topic 下的同一个消费组消费的消费不一样，
     * 同一个topic 下的不同消费组消费的消费是一样的
     * @param consumerRecords
     */
    //指定监听的topic，当前消费者组id
    @KafkaListener(topics = {"test"}, groupId = "receiver2")
    public void registryReceiver3(ConsumerRecord<String, String> consumerRecords) {
        log.info("registryReceiver3-----------"+consumerRecords.value());
    }
}
