package com.example.serverfeign.service.impl;

import com.example.serverfeign.service.HelloFeignService;
import org.springframework.stereotype.Component;

@Component
public class ErrorFeignServiceImpl implements HelloFeignService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry "+name;
    }
}
