package com.klayzz.designpattern.behavior.templatemethod.callback;

public class BClass {
    //发现也能起到代码复用以及扩展的效果
    //类似与模板方法
    public void process(ICallback callback) {
        //...
        callback.methodToCallback();
        //...
    }
}
