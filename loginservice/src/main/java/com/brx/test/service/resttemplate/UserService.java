package com.brx.test.service.resttemplate;

import com.brx.test.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ruxing.bao on 2017/3/3.
 */
@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;


    public Object saveUser(User user){
        return restTemplate.postForObject("http://userservice/saveUser",user,Object.class);
    }

}
