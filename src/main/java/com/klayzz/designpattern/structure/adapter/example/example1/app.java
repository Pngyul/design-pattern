package com.klayzz.designpattern.structure.adapter.example.example1;

import com.klayzz.designpattern.structure.adapter.example.example1.model.ParamsWrapperDefinition;

public class app {
    public static void main(String[] args) {
        CDAdaptor cDAdaptor = new CDAdaptor();

        cDAdaptor.function1();
        cDAdaptor.function2();
        ParamsWrapperDefinition wrapperDefinition = new ParamsWrapperDefinition(2, 3);
        cDAdaptor.function3(wrapperDefinition);
        cDAdaptor.function4();
    }
}
