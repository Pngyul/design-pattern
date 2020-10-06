package com.klayzz.designpattern.behavior.observer.eventbus.observer;

import com.google.common.eventbus.Subscribe;
import com.klayzz.designpattern.behavior.observer.eventbus.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegNotificationObserver {

    @Autowired
    private NotificationService notificationService;

    @Subscribe
    public void handleRegSuccess(Long userId) throws InterruptedException {
        Thread.currentThread().sleep(3*1000);
        notificationService.sendInboxMessage(userId, "...");
    }
}
