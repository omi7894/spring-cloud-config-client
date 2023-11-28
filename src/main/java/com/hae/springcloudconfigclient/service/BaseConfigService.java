package com.hae.springcloudconfigclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class BaseConfigService {

    @Value("${baseConfig.H101.id01.key}")
    private String key;

    public String getKey(){
        return key;
    }

}
