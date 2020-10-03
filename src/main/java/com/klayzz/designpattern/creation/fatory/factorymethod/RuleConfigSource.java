package com.klayzz.designpattern.creation.fatory.factorymethod;


import com.klayzz.designpattern.creation.fatory.factorymethod.factory.IRuleConfigParserFactory;
import com.klayzz.designpattern.creation.fatory.simplefactory.config.RuleConfig;
import com.klayzz.designpattern.creation.fatory.simplefactory.parser.IRuleConfigParser;

public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);

        //获取该类型的工厂类
        IRuleConfigParserFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);
        if (parserFactory == null) {
            throw new RuntimeException("Rule config file format is not supported: " + ruleConfigFilePath);
        }
        IRuleConfigParser parser = parserFactory.createParser();

        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
}

