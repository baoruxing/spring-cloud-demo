package com.brx.test.service.web;

import com.brx.test.service.domain.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ruxing.bao on 2017/2/22.
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="saveUser")
    public Integer saveUser(String username, String password) {
        return userService.save(username, password);

    }
}
