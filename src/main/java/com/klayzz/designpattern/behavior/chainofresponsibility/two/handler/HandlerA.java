package com.klayzz.designpattern.behavior.chainofresponsibility.two.handler;

public class HandlerA extends Handler {
    @Override
    protected boolean doHandle() {
        boolean handled = false;
        //...
        return handled;
    }
}
