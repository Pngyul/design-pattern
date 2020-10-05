package com.klayzz.designpattern.structure.adapter.example.example2.adapter.impl;

import com.klayzz.designpattern.structure.adapter.example.example2.adapter.ISensitiveWordsFilter;
import com.klayzz.designpattern.structure.adapter.example.example2.outfilter.ASensitiveWordsFilter;

public class ASensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {
    private ASensitiveWordsFilter aFilter;
    public String filter(String text) {
        String maskedText = aFilter.filterSexyWords(text);
        maskedText = aFilter.filterPoliticalWords(maskedText);
        return maskedText;
    }
}
