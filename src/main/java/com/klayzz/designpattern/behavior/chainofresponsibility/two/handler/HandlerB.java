package com.klayzz.designpattern.behavior.chainofresponsibility.two.handler;

public class HandlerB extends Handler {
    @Override
    protected boolean doHandle() {
        boolean handled = false;
        //...
        return handled;
    }
}
