package com.lxk.hw.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ConsumerController {
    @JmsListener(destination = "my_msg")
    public void readMsg(String text) {
        System.out.println("接收到单条消息：" + text);
    }

    @JmsListener(destination = "my_map")
    public void readMap(Map map) {
        System.out.println("接收到消息集合：");
        System.out.println(map);
    }
}