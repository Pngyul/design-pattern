package com.klayzz.designpattern.structure.adapter.example.example3;

import com.klayzz.designpattern.structure.adapter.example.example3.a.IA;
import com.klayzz.designpattern.structure.adapter.example.example3.b.B;

// 将外部系统A替换成外部系统B
public class BAdaptor implements IA {
    private B b;
    public BAdaptor(B b) {
        this.b= b;
    }
    public void fa() {
        //...
        b.fb();
    }
}
