package com.sfy.service.impl;

import com.sfy.entity.User;
import com.sfy.mapper.UserMapperr;
import com.sfy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Sfy
 * @Date: 2020/7/2 0002 9:37
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapperr userMapperr;


    @Override
    public List<User> getUser() {
        return userMapperr.getUser();
    }
}
