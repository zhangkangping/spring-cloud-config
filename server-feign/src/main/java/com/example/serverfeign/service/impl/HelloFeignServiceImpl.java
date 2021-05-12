package com.example.serverfeign.service.impl;

import com.example.serverfeign.service.HelloFeignService;

public class HelloFeignServiceImpl implements HelloFeignService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Hello"+name;
    }
}
