package com.brx.test.service.web;

import com.brx.test.service.domain.UserService;
import com.brx.test.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value="saveUser",method = RequestMethod.POST)
    public Object saveUser(@RequestBody User user) {
        int result =  userService.save(user.getUsername(), user.getPassword());
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
