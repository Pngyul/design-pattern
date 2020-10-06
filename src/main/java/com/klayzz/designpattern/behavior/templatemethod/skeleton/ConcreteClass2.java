package com.klayzz.designpattern.behavior.templatemethod.skeleton;

public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void method1() {
        //...
        System.out.println("模板方法中的某个步骤...");
    }

    @Override
    protected void method2() {
        //...
        System.out.println("模板方法中的某个步骤...");
    }
}
