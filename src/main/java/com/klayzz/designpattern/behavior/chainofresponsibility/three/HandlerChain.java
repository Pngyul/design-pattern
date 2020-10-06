package com.klayzz.designpattern.behavior.chainofresponsibility.three;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {
    private List<IHandler> handlers = new ArrayList<>();

    //使用数组的方式实现
    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }
}
