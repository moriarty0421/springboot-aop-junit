package com.aop.PO;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * Title: User
 * Description:用户pojo类
 * @author liuziyang
 * @date 2022/10/28
 */

public class User {
    /** 编号*/
    private Long id;
    /** 姓名*/
    private String name;
    /**
     * 获取编号
     * @return  id
     */
    public Long getId() {
        return id;
    }
    /**
     * 设置编号
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * 获取姓名
     * @return  name
     */
    public String getName() {
        return name;
    }
    /**
     * 设置姓名
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}