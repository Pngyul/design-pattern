package com.klayzz.designpattern.behavior.templatemethod.callback;

public class AClass {
    public static void main(String[] args) {
        BClass b = new BClass();
        //也就实说，传递代码块
        b.process(new ICallback() { //回调对象
            @Override
            public void methodToCallback() {
                System.out.println("Call back me.");
            }
        });
    }
}
