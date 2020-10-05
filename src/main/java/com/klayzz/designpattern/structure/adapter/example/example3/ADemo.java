package com.klayzz.designpattern.structure.adapter.example.example3;

import com.klayzz.designpattern.structure.adapter.example.example3.a.IA;

// 在我们的项目中，外部系统A的使用示例
public class ADemo {
    private IA a;
    public ADemo(IA a) {
        this.a = a;
    }
    //...
}