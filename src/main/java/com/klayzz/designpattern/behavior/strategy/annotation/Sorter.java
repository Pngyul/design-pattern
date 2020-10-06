package com.klayzz.designpattern.behavior.strategy.annotation;


import com.klayzz.designpattern.behavior.strategy.annotation.factory.SortAlgFactory;
import com.klayzz.designpattern.behavior.strategy.annotation.sortalg.ISortAlg;

import java.io.File;

/**
 * 自定义注解扩展策略模式
 */
public class Sorter {
    private static final long GB = 1000 * 1000 * 1000;

    public void sortFile(String filePath) {
        // 省略校验逻辑
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg;
        if (fileSize < 6 * GB) { // [0, 6GB)
            sortAlg = SortAlgFactory.getSortAlg(SortAlgType.QuickSort);
        } else if (fileSize < 10 * GB) { // [6GB, 10GB)
            sortAlg = SortAlgFactory.getSortAlg(SortAlgType.ExternalSort);
        } else if (fileSize < 100 * GB) { // [10GB, 100GB)
            sortAlg = SortAlgFactory.getSortAlg(SortAlgType.ConcurrentExternalSort);
        } else { // [100GB, ~)
            sortAlg = SortAlgFactory.getSortAlg(SortAlgType.MapReduceSort);
        }
        sortAlg.sort(filePath);
    }
}

