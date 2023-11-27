package com.hae.springcloudconfigclient.controller;

import com.hae.springcloudconfigclient.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    private final DictionaryService dictionaryService;

    @Autowired
    public ConfigController(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @GetMapping(value = "/dictionary")
    public Object getDictionary() {
        return dictionaryService.getConfig();
    }

    @GetMapping(value = "/dictionary/ko")
    public Object getDictionaryKo() {
        return dictionaryService.getKo();
    }

    @GetMapping(value = "/dictionary/en")
    public Object getDictionaryEn() {
        return dictionaryService.getEn();
    }

}