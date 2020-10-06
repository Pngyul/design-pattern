package com.klayzz.designpattern.behavior.observer.eventbus.service.impl;

import com.klayzz.designpattern.behavior.observer.eventbus.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public long register(String telephone, String password) {
        return 123456;
    }
}
