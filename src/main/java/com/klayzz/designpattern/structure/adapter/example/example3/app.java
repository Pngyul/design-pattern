package com.klayzz.designpattern.structure.adapter.example.example3;

import com.klayzz.designpattern.structure.adapter.example.example3.a.A;
import com.klayzz.designpattern.structure.adapter.example.example3.b.B;

public class app {
    public static void main(String[] args) {
        //A系统
        ADemo a = new ADemo(new A());
        //引入B系统
        ADemo b = new ADemo(new BAdaptor(new B()));
    }
}
