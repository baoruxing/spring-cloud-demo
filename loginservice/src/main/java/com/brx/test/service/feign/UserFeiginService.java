package com.brx.test.service.feign;

import com.brx.test.service.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    //@HystrixCommand()
    public Object saveUser(@RequestBody User user);
}
