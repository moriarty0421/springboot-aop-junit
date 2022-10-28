package com.aop.result;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * @Title: ResultBody
 * @Description: 返回格式
 * @author liuziyang
 * @date 2022/10/28
 */
public class ResultBody {
    /**
     * 响应代码
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

    public ResultBody() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}