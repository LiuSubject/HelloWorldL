package com.lxk.hw;

import com.lxk.hw.controller.KafkaSenderController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 项目名称：HelloWorldL
 * 类名称：TestKafka
 * 类描述：
 * 创建人：lxk
 * 创建时间：2019-03-26 23:31
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
@Component
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloworldApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestKafka {
    @Autowired
    private KafkaSenderController sender;
    @Test
    public void aaa(){
        for (int i = 0; i < 3; i++) {
            //调用消息发送类中的消息发送方法
            sender.send();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
