package com.klayzz.designpattern.behavior.chainofresponsibility.three;

// 使用举例

/**
 * 类似于第一种
 * 唯一不同点是，拦截器链使用数组方式实现
 */
public class Application {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
