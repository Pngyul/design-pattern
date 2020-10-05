package com.klayzz.designpattern.structure.adapter.example.example2.outfilter;

// A敏感词过滤系统提供的接口
public class ASensitiveWordsFilter {
    //text是原始文本，函数输出用***替换敏感词之后的文本
    public String filterSexyWords(String text) {
        // ...
        return text;
    }

    public String filterPoliticalWords(String text) {
        // ...
        return text;
    }
}
