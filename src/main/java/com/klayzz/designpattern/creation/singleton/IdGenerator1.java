package com.klayzz.designpattern.creation.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 双重检测，支持懒加载，支持并发
 */
public class IdGenerator1 {
    private AtomicLong id = new AtomicLong(0);
    //添加volatile防止指令重排序
    //其实在高版本jdk中不用volatile也可以了
    private static volatile IdGenerator1 instance;
    private IdGenerator1() {}

    public static IdGenerator1 getInstance(){
        if(instance == null){
            synchronized (IdGenerator1.class){
                if(instance == null){
                    return new IdGenerator1();
                }
            }
        }
        return instance;
    }

    public long getId(){
        return id.incrementAndGet();
    }


}
