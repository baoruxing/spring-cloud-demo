package com.brx.test.service.web;

import com.brx.test.service.domain.UserService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ruxing.bao on 2017/2/22.
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="saveUser")
    public Object saveUser(String username, String password) {
        int result =  userService.save(username, password);
        Map<String,String> map = new HashMap<String, String>();
        if (result == 1) {

            map.put("code","200");
            map.put("msg","success");
        }else {
            map.put("code","501");
            map.put("msg","fail");
        }

        return map;
    }
}
