package com.klayzz.designpattern.structure.proxy.staticproxy;

import com.klayzz.designpattern.structure.proxy.staticproxy.controller.IUserController;
import com.klayzz.designpattern.structure.proxy.staticproxy.controller.UserController;

public class app {
    public static void main(String[] args) {
        // 因为原始类和代理类实现相同的接口，是基于接口而非实现编程
        // 将UserController类对象替换为UserControllerProxy类对象，不需要改动太多代码
        IUserController userController = new UserControllerProxy(new UserController());

        userController.login("22","123");


        //继承代理类
        //UserControllerProxy使用举例
        UserController userController1 = new UserControllerProxy1();
        userController1.register("22","123");
    }
}
