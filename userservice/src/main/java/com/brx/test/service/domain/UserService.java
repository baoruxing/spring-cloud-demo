package com.brx.test.service.domain;

import com.brx.test.service.dao.UserDao;
import com.brx.test.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ruxing.bao on 2017/2/22.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public int save(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userDao.save(user);
    }
}
