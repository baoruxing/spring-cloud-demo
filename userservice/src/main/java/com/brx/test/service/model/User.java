package com.brx.test.service.model;

/**
 * Created by ruxing.bao on 2017/2/22.
 */
public class User {
    public Integer userId;
    public String  username;
    public String  password;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
