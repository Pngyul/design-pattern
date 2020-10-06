package com.klayzz.designpattern.behavior.templatemethod.skeleton;

public abstract class AbstractClass {
    public final void templateMethod() {
        //...
        System.out.println("模板方法...");
        method1();
        //...
        System.out.println("模板方法...");
        method2();
        //...
        System.out.println("模板方法...");
    }

    protected abstract void method1();
    protected abstract void method2();
}
