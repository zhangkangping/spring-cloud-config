package com.example.serverfeign.service;

import com.example.serverfeign.service.impl.ErrorFeignServiceImpl;
import com.example.serverfeign.service.impl.HelloFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
//fallback为断路器中的熔断方法
@FeignClient(value = "server-client01", fallback = ErrorFeignServiceImpl.class)
public interface HelloFeignService {

    @GetMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
