package com.liang.admin.entity.system;

public class PushMessage {

    private String loginUserNum;

    private String content;

    public PushMessage(){}

    public PushMessage(String loginUserNum, String content) {
        this.loginUserNum = loginUserNum;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLoginUserNum() {
        return loginUserNum;
    }

    public void setLoginUserNum(String loginUserNum) {
        this.loginUserNum = loginUserNum;
    }
}
