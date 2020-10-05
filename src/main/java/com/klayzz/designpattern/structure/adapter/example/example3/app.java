package com.klayzz.designpattern.structure.adapter.example.example3;

import com.klayzz.designpattern.structure.adapter.example.example3.a.A;
import com.klayzz.designpattern.structure.adapter.example.example3.b.B;

public class app {
    public static void main(String[] args) {
        //A系统
        ADemo a = new ADemo(new A());
        //引入B系统
        // 借助BAdaptor，Demo的代码中，调用IA接口的地方都无需改动，
        // 只需要将BAdaptor如下注入到Demo即可。
        ADemo b = new ADemo(new BAdaptor(new B()));
    }
}
