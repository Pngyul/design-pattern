package com.klayzz.designpattern.behavior.chainofresponsibility.two.handler;

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    //模板方法
    public final void handle() {
        boolean handled = doHandle();
        if (successor != null && !handled) {
            successor.handle();
        }
    }

    //子类必须实现
    protected abstract boolean doHandle();
}
