package com.klayzz.designpattern.structure.adapter.example.example2.adapter.impl;

import com.klayzz.designpattern.structure.adapter.example.example2.adapter.ISensitiveWordsFilter;
import com.klayzz.designpattern.structure.adapter.example.example2.outfilter.BSensitiveWordsFilter;

public class BSensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {
    private BSensitiveWordsFilter bFilter;
    public String filter(String text) {
        String maskedText = bFilter.filter(text);
        return maskedText;
    }
}
