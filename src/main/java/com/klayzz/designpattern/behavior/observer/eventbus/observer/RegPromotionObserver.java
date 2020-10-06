package com.klayzz.designpattern.behavior.observer.eventbus.observer;

import com.google.common.eventbus.Subscribe;
import com.klayzz.designpattern.behavior.observer.eventbus.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegPromotionObserver {
    @Autowired
    private PromotionService promotionService; // 依赖注入

    @Subscribe
    public void handleRegSuccess(Long userId) throws InterruptedException {
        Thread.currentThread().sleep(3*1000);
        promotionService.issueNewUserExperienceCash(userId);
    }
}


