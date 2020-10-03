package com.klayzz.designpattern.structure.proxy.staticproxy.controller;


import com.klayzz.designpattern.structure.proxy.staticproxy.entity.UserVo;
import com.klayzz.designpattern.structure.proxy.staticproxy.service.MetricsCollector;

public class UserController implements IUserController{
    //...省略其他属性和方法...
    private MetricsCollector metricsCollector; // 依赖注入

    public UserVo login(String telephone, String password) {
        //...省略login逻辑...
        //请求记录
        metricsCollector.recordRequest(null);
        return new UserVo();
    }

    public UserVo register(String telephone, String password) {
        //...省略register逻辑...
        //请求记录
        metricsCollector.recordRequest(null);
        return new UserVo();
    }
}
