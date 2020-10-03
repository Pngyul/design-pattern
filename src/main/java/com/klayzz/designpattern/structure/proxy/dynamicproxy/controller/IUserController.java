package com.klayzz.designpattern.structure.proxy.dynamicproxy.controller;

import com.klayzz.designpattern.structure.proxy.staticproxy.entity.UserVo;

public interface IUserController {

    UserVo login(String telephone, String password);
    UserVo register(String telephone, String password);
}
