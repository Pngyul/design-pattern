package com.klayzz.designpattern.behavior.strategy.nornal;

import com.klayzz.designpattern.behavior.strategy.nornal.factory.SortAlgFactory;
import com.klayzz.designpattern.behavior.strategy.nornal.sortalg.*;

import java.io.File;

/**
 * 虽然利用了策略模式，把 策略的定义，创建和使用结构了，
 * 但是还存在冗余的if-els，并没有彻底的去掉。
 */
public class Sorter {
    private static final long GB = 1000 * 1000 * 1000;

    public void sortFile(String filePath) {
        // 省略校验逻辑
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg;
        if (fileSize < 6 * GB) { // [0, 6GB)
            sortAlg = SortAlgFactory.getSortAlg("QuickSort");
        } else if (fileSize < 10 * GB) { // [6GB, 10GB)
            sortAlg = SortAlgFactory.getSortAlg("ExternalSort");
        } else if (fileSize < 100 * GB) { // [10GB, 100GB)
            sortAlg = SortAlgFactory.getSortAlg("ConcurrentExternalSort");
        } else { // [100GB, ~)
            sortAlg = SortAlgFactory.getSortAlg("MapReduceSort");
        }
        sortAlg.sort(filePath);
    }
}

