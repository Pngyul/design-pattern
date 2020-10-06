package com.klayzz.designpattern.behavior.observer.skeleton;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Message message);
}
