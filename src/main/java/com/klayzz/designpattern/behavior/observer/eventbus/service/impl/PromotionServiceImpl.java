package com.klayzz.designpattern.behavior.observer.eventbus.service.impl;

import com.klayzz.designpattern.behavior.observer.eventbus.service.PromotionService;
import org.springframework.stereotype.Service;

@Service("promotionService")
public class PromotionServiceImpl implements PromotionService {
    @Override
    public void issueNewUserExperienceCash(Long userId) {
        System.out.println(Thread.currentThread().getName()+"恭喜注册成功，你的用户id是"+userId+",你获得了优惠券");
    }
}
