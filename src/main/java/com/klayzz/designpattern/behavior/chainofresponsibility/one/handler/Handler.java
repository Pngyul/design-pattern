package com.klayzz.designpattern.behavior.chainofresponsibility.one.handler;

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle();
}
