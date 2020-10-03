package com.klayzz.designpattern.creation.fatory.simplefactory;


import com.klayzz.designpattern.creation.fatory.simplefactory.parser.IRuleConfigParser;
import com.klayzz.designpattern.creation.fatory.simplefactory.parser.impl.JsonRuleConfigParser;
import com.klayzz.designpattern.creation.fatory.simplefactory.parser.impl.PropertiesRuleConfigParser;
import com.klayzz.designpattern.creation.fatory.simplefactory.parser.impl.XmlRuleConfigParser;
import com.klayzz.designpattern.creation.fatory.simplefactory.parser.impl.YamlRuleConfigParser;

import java.util.HashMap;
import java.util.Map;

/**
 * 对象可复用时，结合单例模式
 * 节省内存，事先缓存parser对象
 */
public class RuleConfigParserFactory1 {
    private static final Map<String, IRuleConfigParser> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
        cachedParsers.put("yaml", new YamlRuleConfigParser());
        cachedParsers.put("properties", new PropertiesRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            return null;//返回null还是IllegalArgumentException全凭你自己说了算
        }
        IRuleConfigParser parser = cachedParsers.get(configFormat.toLowerCase());
        return parser;
    }
}
