package com.klayzz.designpattern.behavior.strategy.annotation.factory;


import com.klayzz.designpattern.behavior.strategy.annotation.SortAlg;
import com.klayzz.designpattern.behavior.strategy.annotation.sortalg.ISortAlg;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.HashMap;
import java.util.Map;

public class SortAlgFactory implements ApplicationContextAware {
    private static final Map<Integer, ISortAlg> algs = new HashMap<>();

    public static ISortAlg getSortAlg(Integer type) {
        if (type == null) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return algs.get(type);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //获取所有策略注解的Bean
        Map<String, Object> sorterStrategyMap = applicationContext.getBeansWithAnnotation(SortAlg.class);
        sorterStrategyMap.forEach((k,v)->{
            //获取策略实现类
            Class<ISortAlg> sorterStrategyClass = (Class<ISortAlg>) v.getClass();
            //获取策略实现类的注解值。
            int type = sorterStrategyClass.getAnnotation(SortAlg.class).value();
            algs.put(type,applicationContext.getBean(sorterStrategyClass));
        });
    }
}


