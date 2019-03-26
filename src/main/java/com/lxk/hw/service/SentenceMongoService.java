package com.lxk.hw.service;

import com.lxk.hw.dao.SentenceMongoDAO;
import com.lxk.hw.entity.SentenceMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目名称：tmall_springboot
 * 类名称：EmpService
 * 类描述：
 * 创建人：lxk
 * 创建时间：2018-12-20 13:50
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
@Service
@CacheConfig(cacheNames="sentenceMongos")
public class SentenceMongoService {
    @Autowired
    SentenceMongoDAO sentenceMongoDAO;

    public List<SentenceMongo> getSentenceMongoList() {
        List<SentenceMongo> sntenceMongoList=sentenceMongoDAO.findAll();
        return sntenceMongoList;
    }
}
