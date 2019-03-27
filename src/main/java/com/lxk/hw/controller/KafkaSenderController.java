package com.lxk.hw.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lxk.hw.entity.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * 项目名称：HelloWorldL
 * 类名称：KafkaSenderController
 * 类描述：
 * 创建人：lxk
 * 创建时间：2019-03-26 23:25
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
@Slf4j
@RestController
public class KafkaSenderController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private Gson gson = new GsonBuilder().create();

    /**
     * 发送消息的方法
     */
    @RequestMapping("/sendKafkaMsg")
    public String send() {
        Message message = new Message();
        message.setId(System.currentTimeMillis());
        message.setMsg(UUID.randomUUID().toString());
        message.setSendTime(LocalDateTime.now());
        log.info("+++++++++++++++++++++  message = {}", gson.toJson(message));
        kafkaTemplate.send("Y.S.K", gson.toJson(message));
        return "Kafka , Hello World " + kafkaTemplate.toString();
    }
}