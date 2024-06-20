package com.jiuhuacha.backend.rpc.demo.api;

/**
 * @description: 用户
 * @author: jiuhuacha
 * @create: 2024-06-20 22:06
 */
public class User {

    private Integer uid;
    private String name;

    public User() {
    }

    public User(Integer uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" + "uid=" + uid + ", name='" + name + '\'' + '}';
    }
}
