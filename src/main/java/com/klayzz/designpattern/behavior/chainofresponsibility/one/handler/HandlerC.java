package com.klayzz.designpattern.behavior.chainofresponsibility.one.handler;

public class HandlerC extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        //...
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
