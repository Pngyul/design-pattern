package com.klayzz.designpattern.behavior.chainofresponsibility.two;

import com.klayzz.designpattern.behavior.chainofresponsibility.one.handler.Handler;

public class HandlerChain {
    private Handler head = null;
    private Handler tail = null;

    //类似于链表，不容易懂
    public void addHandler(Handler handler) {
        handler.setSuccessor(null);

        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }

        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle() {
        if (head != null) {
            head.handle();
        }
    }
}
