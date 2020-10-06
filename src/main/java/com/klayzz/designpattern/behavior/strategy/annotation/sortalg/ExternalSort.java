package com.klayzz.designpattern.behavior.strategy.annotation.sortalg;

import com.klayzz.designpattern.behavior.strategy.annotation.SortAlg;
import com.klayzz.designpattern.behavior.strategy.annotation.SortAlgType;
import org.springframework.stereotype.Component;

@Component
@SortAlg(SortAlgType.ExternalSort)
public class ExternalSort implements ISortAlg {
    @Override
    public void sort(String filePath) {
        
    }
}
