package com.klayzz.designpattern.structure.proxy.staticproxy;

import com.klayzz.designpattern.structure.proxy.staticproxy.controller.IUserController;
import com.klayzz.designpattern.structure.proxy.staticproxy.controller.UserController;
import com.klayzz.designpattern.structure.proxy.staticproxy.entity.RequestInfo;
import com.klayzz.designpattern.structure.proxy.staticproxy.entity.UserVo;
import com.klayzz.designpattern.structure.proxy.staticproxy.service.MetricsCollector;

/**
 * 继承被代理类接口的方式
 *
 * 继承代理对象接口，通过组合的方式，实现静态代理。
 * 虽然业务代码和切面逻辑隔离，但是需要硬编码为每个被代理类实现代理
 */
public class UserControllerProxy implements IUserController {
    private MetricsCollector metricsCollector;
    private UserController userController;

    public UserControllerProxy(UserController userController) {
        this.userController = userController;
        this.metricsCollector = new MetricsCollector();
    }

    @Override
    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // 委托
        UserVo userVo = userController.login(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

    @Override
    public UserVo register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        UserVo userVo = userController.register(telephone, password);

        //重复代码
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }
}

