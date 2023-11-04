package com.example.demo;


import com.example.demo.key.KeyValueProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MyService {
    private final KeyValueProperties keyValueConfig;

    @Autowired
    public MyService(KeyValueProperties keyValueConfig) {
        this.keyValueConfig = keyValueConfig;
    }

    public String getValueForKey(String key) {
        Map<String, String> keyValueMap = keyValueConfig.getKeyValueMap();
        return keyValueMap.get(key);
    }
}
