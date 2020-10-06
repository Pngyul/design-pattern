package com.klayzz.designpattern.behavior.templatemethod.skeleton;

/**
 * 经典模板方法骨架测试用例
 */
public class app {
    public static void main(String[] args) {
        AbstractClass demo = new ConcreteClass1();
        demo.templateMethod();
        System.out.println("-----------------------");
        AbstractClass demo1 = new ConcreteClass2();
        demo1.templateMethod();
    }
}
