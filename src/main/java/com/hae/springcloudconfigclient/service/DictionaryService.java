package com.hae.springcloudconfigclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RefreshScope
public class DictionaryService {

    @Value("${ko.button.confirm}")
    private String kr;
    @Value("${en.button.confirm}")
    private String en;

    public Map<String, String> getConfig() {
        Map<String, String> map = new HashMap<>();
        map.put("kr", kr);
        map.put("en", en);
        return map;
    }

    public String getKo(){
        return kr;
    }

    public String getEn(){
        return en;
    }
}
