package com.klayzz.designpattern.structure.adapter.example.example1;

import com.klayzz.designpattern.structure.adapter.example.example1.model.ParamsWrapperDefinition;

// 注意：适配器类的命名不一定非得末尾带Adaptor
public class CDAdaptor extends CD implements ITarget {
        //...
        public void function1() {
            super.staticFunction1();
        }

        public void function2() {
            super.uglyNamingFunction2();
        }
        public void function3(ParamsWrapperDefinition paramsWrapper) {
            super.tooManyParamsFunction3(paramsWrapper.getParamA(), paramsWrapper.getParamB());
        }
        public void function4() {
            //...reimplement it...
            System.out.println("适配后的高性能方法");
        }
}
