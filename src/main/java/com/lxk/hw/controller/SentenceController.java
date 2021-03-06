package com.lxk.hw.controller;

import com.alibaba.fastjson.JSON;
import com.lxk.hw.entity.Sentence;
import com.lxk.hw.entity.SentenceMongo;
import com.lxk.hw.service.SentenceMongoService;
import com.lxk.hw.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 项目名称：HelloWorldL
 * 类名称：SentenceController
 * 类描述：
 * 创建人：lxk
 * 创建时间：2019-03-26 14:31
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/helloworld")
public class SentenceController {

    @Autowired
    SentenceService sentenceService;
    @Autowired
    SentenceMongoService sentenceMongoService;

    @RequestMapping("getSentenceList")
    public String getSentenceList() {
        List<Sentence> sentenceList = sentenceService.getSentenceList();
        String jsonStr = JSON.toJSONString(sentenceList);
        return  jsonStr;
    }

    @RequestMapping("getSentenceMongoList")
    public String getSentenceMongoList() {
        List<SentenceMongo> sentenceMongoList = sentenceMongoService.getSentenceMongoList();
        String jsonStr = JSON.toJSONString(sentenceMongoList);
        return sentenceMongoList.toString();
    }
}
