package com.klayzz.designpattern.creation.fatory.simplefactory.parser;

import com.klayzz.designpattern.creation.fatory.simplefactory.config.RuleConfig;

public interface IRuleConfigParser {
    RuleConfig parse(String configText);
}
