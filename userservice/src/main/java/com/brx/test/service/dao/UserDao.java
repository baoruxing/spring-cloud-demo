package com.brx.test.service.dao;

import com.brx.test.service.model.User;

/**
 * Created by ruxing.bao on 2017/2/22.
 */
public interface UserDao {

    public int save(User user);

    public User find(String username,String password);
}
