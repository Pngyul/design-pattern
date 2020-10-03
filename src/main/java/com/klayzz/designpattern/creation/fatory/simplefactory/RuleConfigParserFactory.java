package com.klayzz.designpattern.creation.fatory.simplefactory;

import com.klayzz.designpattern.creation.fatory.simplefactory.parser.*;
import com.klayzz.designpattern.creation.fatory.simplefactory.parser.impl.JsonRuleConfigParser;
import com.klayzz.designpattern.creation.fatory.simplefactory.parser.impl.PropertiesRuleConfigParser;
import com.klayzz.designpattern.creation.fatory.simplefactory.parser.impl.XmlRuleConfigParser;
import com.klayzz.designpattern.creation.fatory.simplefactory.parser.impl.YamlRuleConfigParser;

/**
 * 把一推的if-else放到工厂类中，每次调用都要创建一个新的parser对象
 */
public class RuleConfigParserFactory {
    public static IRuleConfigParser createParser(String configFormat) {
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(configFormat)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(configFormat)) {
            parser = new PropertiesRuleConfigParser();
        }
        return parser;
    }
}
