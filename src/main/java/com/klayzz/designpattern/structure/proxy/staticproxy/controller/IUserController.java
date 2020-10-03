package com.klayzz.designpattern.structure.proxy.staticproxy.controller;

import com.klayzz.designpattern.structure.proxy.staticproxy.entity.UserVo;

public interface IUserController {

    UserVo login(String telephone, String password);
    UserVo register(String telephone, String password);
}
