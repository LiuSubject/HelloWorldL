package com.lxk.hw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * 项目名称：HelloWorldL
 * 类名称：Sentence
 * 类描述：
 * 创建人：lxk
 * 创建时间：2019-03-26 14:29
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
@Document(collection = "sentenceMongo")
@Data
@AllArgsConstructor
@ToString
public class SentenceMongo implements Serializable {

    @Id
    private ObjectId id;
    private String SentenceMongo;

}
