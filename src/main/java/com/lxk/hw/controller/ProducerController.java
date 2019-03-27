package com.lxk.hw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProducerController {
    //注入jsmtemplate
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("/sendMsg")
    public String sendMsg() {
        jmsMessagingTemplate.convertAndSend("my_msg", "Hello World");
        System.out.println("msg发送成功");
        return "ActiveMQ , Hello World " + jmsMessagingTemplate.toString();
    }

    @RequestMapping("/sendMap")
    public void sendMap() {
        Map map = new HashMap();
        map.put("first", "Hello");
        map.put("second", "World");
        jmsMessagingTemplate.convertAndSend("my_map", map);
        System.out.println("map发送成功");
    }
}