package com.klayzz.designpattern.behavior.chainofresponsibility.one;

import com.klayzz.designpattern.behavior.chainofresponsibility.one.handler.HandlerA;
import com.klayzz.designpattern.behavior.chainofresponsibility.one.handler.HandlerB;
import com.klayzz.designpattern.behavior.chainofresponsibility.one.handler.HandlerC;

/**
 * 这样会存在一个问题，
 * 个不熟悉这种代码结构的程序员，
 * 在添加新的处理器类的时候，
 * 很有可能忘记在 handle() 函数中调用 successor.handle()，
 * 这就会导致代码出现 bug。
 */
public class Application {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.addHandler(new HandlerC());
        chain.handle();
    }
}
