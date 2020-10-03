package com.klayzz.designpattern.structure.proxy.dynamicproxy.controller;


import com.klayzz.designpattern.structure.proxy.staticproxy.entity.UserVo;
import com.klayzz.designpattern.structure.proxy.staticproxy.service.MetricsCollector;

public class UserController implements IUserController {
    //...省略其他属性和方法...

    public UserVo login(String telephone, String password) {
        System.out.println("---------正在处理登录逻辑---------");
        //...省略login逻辑...
        return new UserVo();
    }

    public UserVo register(String telephone, String password) {
        System.out.println("---------正在处理注册逻辑---------");
        //...省略register逻辑...
        return new UserVo();
    }
}
