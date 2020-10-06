package com.klayzz.designpattern.behavior.chainofresponsibility.two;

import com.klayzz.designpattern.behavior.chainofresponsibility.one.handler.HandlerA;
import com.klayzz.designpattern.behavior.chainofresponsibility.one.handler.HandlerB;

/**
 * 利用模板模式，将调用 successor.handle()
 * 的逻辑从具体的处理器类中剥离出来，放到抽象父类中
 */
public class Application {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
