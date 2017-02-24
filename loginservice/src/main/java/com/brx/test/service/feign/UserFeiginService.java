package com.brx.test.service.feign;

import com.brx.test.service.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ruxing.bao on 2017/2/24.
 */

@FeignClient("userservice")
public interface UserFeiginService {

    @RequestMapping(value="saveUser",method = RequestMethod.POST)
    public Object saveUser(@RequestBody User user);
}
