package com.klayzz.designpattern.structure.adapter.example.example1;

//这个类来自外部sdk，我们无权修改它的代码
public class CD {

    public static void staticFunction1() {
        //...
        System.out.println("CD 原始静态方法。。");
    }
    public void uglyNamingFunction2() {
        //...
        System.out.println("CD 原始的丑陋的命名方法。。");
    }

    public void tooManyParamsFunction3(int paramA, int paramB) {
        //...
        System.out.println("CD 原始的多参数方法");
    }

    public void lowPerformanceFunction4() {
        //...
        System.out.println("CD 原始的低性能方法");
    }
}