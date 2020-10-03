package com.klayzz.designpattern.structure.proxy.dynamicproxy;


import com.klayzz.designpattern.structure.proxy.dynamicproxy.controller.IUserController;
import com.klayzz.designpattern.structure.proxy.dynamicproxy.controller.UserController;

public class app {
    public static void main(String[] args) {

        //MetricsCollectorProxy使用举例
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userController = (IUserController) proxy.createProxy(new UserController());
        userController.login("login","012");
    }
}
