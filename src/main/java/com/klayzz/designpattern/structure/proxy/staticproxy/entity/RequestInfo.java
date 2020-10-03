package com.klayzz.designpattern.structure.proxy.staticproxy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RequestInfo {
    private String requestType;
    private long responseTime;
    private long startTimestamp;

}
