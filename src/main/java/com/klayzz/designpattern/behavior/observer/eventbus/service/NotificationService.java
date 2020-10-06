package com.klayzz.designpattern.behavior.observer.eventbus.service;

public interface NotificationService {
    void sendInboxMessage(Long userId, String message);
}
