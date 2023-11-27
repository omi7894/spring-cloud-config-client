package com.hae.springcloudconfigclient.controller;

import com.hae.springcloudconfigclient.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hae.springcloudconfigclient.service.ConfigService;

/**
 * @author madplay
 */
@RestController
public class ConfigController {

    //private final ConfigService configDynamicService;
    private final DictionaryService dictionaryService;

    @Autowired
    public ConfigController(DictionaryService dictionaryService) {
        //this.configDynamicService = configDynamicService;
        this.dictionaryService = dictionaryService;
    }

    /*@GetMapping(value = "/config")
    public Object getConfig() {
        return configDynamicService.getConfig();
    }*/

    @GetMapping(value = "/dictionary")
    public Object getDictionary() {
        return dictionaryService.getConfig();
    }
}