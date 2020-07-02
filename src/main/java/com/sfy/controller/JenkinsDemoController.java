package com.sfy.controller;

import com.sfy.entity.User;
import com.sfy.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Sfy
 * @Date: 2020/7/2 0002 9:24
 */
@RestController
public class JenkinsDemoController {

    @Resource
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET,path = "/getUser")
    public List<User> getUser()
    {
        return userService.getUser();
    }

}
