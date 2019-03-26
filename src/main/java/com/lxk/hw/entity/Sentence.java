package com.lxk.hw.entity;

import javax.persistence.*;
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
@Entity
@Table(name = "sentence")
public class Sentence implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "sentence")
    private String sentence;

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

}
