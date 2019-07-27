package com.liang.admin.entity.system;

import java.time.LocalDateTime;

public class PushMessage {


    //发送方
    private String sender;

    //接收方
    private String receiver;

    private String content;

    private String createTime;

    public PushMessage(){}

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }


    public String getCreateTime() {
        return LocalDateTime.now().toString();
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
