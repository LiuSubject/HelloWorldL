package com.lxk.hw.entity;

import java.time.LocalDateTime;

/**
 * 项目名称：HelloWorldL
 * 类名称：Message
 * 类描述：
 * 创建人：lxk
 * 创建时间：2019-03-26 23:13
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class Message {
    private Long id;
    private String msg;
    private LocalDateTime sendTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }
}
