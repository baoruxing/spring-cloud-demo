package com.brx.test.service.web;

import com.brx.test.service.feign.UserFeiginService;
import com.brx.test.service.model.User;
import com.brx.test.service.resttemplate.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ruxing.bao on 2017/2/24.
 */
@RestController
public class LoginController {
    @Autowired
    private UserFeiginService userService;

    @Autowired
    private UserService userServiceT;

    @RequestMapping(value="saveUser")
    public Object saveUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userService.saveUser(user);
    }

    @RequestMapping(value="saveUserT")
    public Object saveUserT(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userServiceT.saveUser(user);
    }
}
