package com.klayzz.designpattern.creation.fatory.factorymethod.factory;

import com.klayzz.designpattern.creation.fatory.simplefactory.parser.IRuleConfigParser;

/**
 * 定义一个工厂接口
 * 新增新的工厂类只需要实现该接口即可，更加符合开闭原则
 */
public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
