package com.klayzz.designpattern.behavior.observer.eventbus.service.impl;

import com.klayzz.designpattern.behavior.observer.eventbus.service.NotificationService;
import org.springframework.stereotype.Service;

@Service("notificationService")
public class NotificationServiceImpl implements NotificationService {
    @Override
    public void sendInboxMessage(Long userId,String message) {
        System.out.println(Thread.currentThread().getName()+"邮件：尊敬的用户 "+userId+"你好，"+message);
    }
}
