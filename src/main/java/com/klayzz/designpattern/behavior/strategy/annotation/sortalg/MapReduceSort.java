package com.klayzz.designpattern.behavior.strategy.annotation.sortalg;

import com.klayzz.designpattern.behavior.strategy.annotation.SortAlg;
import com.klayzz.designpattern.behavior.strategy.annotation.SortAlgType;
import org.springframework.stereotype.Component;

@Component
@SortAlg(SortAlgType.MapReduceSort)
public class MapReduceSort implements ISortAlg {
    @Override
    public void sort(String filePath) {
        
    }
}
