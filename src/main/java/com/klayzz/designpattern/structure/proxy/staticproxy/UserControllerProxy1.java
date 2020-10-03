package com.klayzz.designpattern.structure.proxy.staticproxy;

import com.klayzz.designpattern.structure.proxy.staticproxy.controller.UserController;
import com.klayzz.designpattern.structure.proxy.staticproxy.entity.RequestInfo;
import com.klayzz.designpattern.structure.proxy.staticproxy.entity.UserVo;
import com.klayzz.designpattern.structure.proxy.staticproxy.service.MetricsCollector;

public class UserControllerProxy1 extends UserController {
    private MetricsCollector metricsCollector;

    public UserControllerProxy1() {
        this.metricsCollector = new MetricsCollector();
    }

    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        UserVo userVo = super.login(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

    public UserVo register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        UserVo userVo = super.register(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }
}