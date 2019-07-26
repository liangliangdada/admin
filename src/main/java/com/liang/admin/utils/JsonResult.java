package com.liang.admin.utils;

import java.io.Serializable;

/**
 * 全局统一返回对象
 */
public class JsonResult implements Serializable {

    private static final long serialVersionUID = 814696245293384006L;

    private boolean success;

    private String msg;

    private Object data;

    public JsonResult(){}

    public JsonResult(Boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public synchronized static JsonResult build(Boolean success, String msg){
        JsonResult jsonResult = new JsonResult(success,msg);
        return jsonResult;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
