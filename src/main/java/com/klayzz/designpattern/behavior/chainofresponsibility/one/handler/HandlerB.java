package com.klayzz.designpattern.behavior.chainofresponsibility.one.handler;

public class HandlerB extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        //...
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
