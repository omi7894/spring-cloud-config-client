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
    private String kr_confirm;
    @Value("${en.button.confirm}")
    private String en_confirm;

    public Map<String, String> getConfig() {
        Map<String, String> map = new HashMap<>();
        map.put("kr_confirm", kr_confirm);
        map.put("en_confirm", en_confirm);
        return map;
    }

    public String getKo(){
        return kr_confirm;
    }

    public String getEn(){
        return en_confirm;
    }
}
