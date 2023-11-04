package com.example.demo;


import com.example.demo.key.KeyValueProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final KeyValueProperties keyValueConfig;

    @Autowired
    public MyService(KeyValueProperties keyValueConfig) {
        this.keyValueConfig = keyValueConfig;
    }

    public String getValueForKey(String key) {
        return keyValueConfig.getKeyValueMap().get(key);
    }
}
