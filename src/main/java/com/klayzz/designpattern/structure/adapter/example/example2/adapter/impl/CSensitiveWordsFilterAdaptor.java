package com.klayzz.designpattern.structure.adapter.example.example2.adapter.impl;

import com.klayzz.designpattern.structure.adapter.example.example2.adapter.ISensitiveWordsFilter;
import com.klayzz.designpattern.structure.adapter.example.example2.outfilter.CSensitiveWordsFilter;

public class CSensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {
    private CSensitiveWordsFilter cFilter;
    public String filter(String text) {
        String maskedText = cFilter.filter(text,"***");
        return maskedText;
    }
}
