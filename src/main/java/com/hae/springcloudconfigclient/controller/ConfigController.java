package com.hae.springcloudconfigclient.controller;

import com.hae.springcloudconfigclient.service.BaseConfigService;
import com.hae.springcloudconfigclient.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    private final DictionaryService dictionaryService;
    private final BaseConfigService baseConfigService;

    @Autowired
    public ConfigController(DictionaryService dictionaryService, BaseConfigService baseConfigService) {
        this.dictionaryService = dictionaryService;
        this.baseConfigService = baseConfigService;
    }

    @GetMapping(value = "/dictionary")
    public Object getDictionary() {
        return dictionaryService.getConfig();
    }

    @GetMapping(value = "/dictionary/kr")
    public Object getDictionaryKr() {
        return dictionaryService.getKr();
    }

    @GetMapping(value = "/dictionary/en")
    public Object getDictionaryEn() {
        return dictionaryService.getEn();
    }

    @GetMapping(value = "/baseConfig")
    public Object getBaseConfig() { return baseConfigService.getKey(); }

}