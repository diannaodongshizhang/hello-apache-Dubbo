package com.yrx.apache.dubbo.provider.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

import com.yrx.apache.dubbo.provider.api.EchoService;

@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String echo(String string) {
        return "Echo Hello Dubbo " + string+" port:"+port;
    }
}