package com.lxk.hw.dao;

import com.lxk.hw.entity.SentenceMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 项目名称：HelloWorldL
 * 类名称：SentenceDAO
 * 类描述：
 * 创建人：lxk
 * 创建时间：2019-03-26 14:53
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public interface SentenceMongoDAO extends MongoRepository<SentenceMongo,Long> {

}
