package com.klayzz.designpattern.behavior.strategy.annotation;

import lombok.Data;

/**
 * @Author pengyu
 * @Date 2020/9/22 9:16
 */
@Data
public class SortAlgType {
    public static final int QuickSort = 1;
    public static final int ExternalSort = 2;
    public static final int ConcurrentExternalSort = 3;
    public static final int MapReduceSort = 4;


}
