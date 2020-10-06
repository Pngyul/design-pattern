package com.klayzz.designpattern.behavior.strategy.annotation;

import java.lang.annotation.*;

/**
 * @Author pengyu
 * @Date 2020/9/22 9:10
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited //子类可继承此注解
public @interface SortAlg {

    /**
     * 策略类型
     * @return
     */
    int value();
}
