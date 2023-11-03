package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final KeyValueConfig keyValueConfig;

    @Autowired
    public MyService(KeyValueConfig keyValueConfig) {
        this.keyValueConfig = keyValueConfig;
    }

    public String getValueForKey(String key) {
        return keyValueConfig.getKeyValueMap().get(key);
    }
}
