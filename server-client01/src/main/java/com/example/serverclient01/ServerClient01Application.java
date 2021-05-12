package com.example.serverclient01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServerClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(ServerClient01Application.class, args);
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return name+" 大哥好！"+"您的端口号为："+port;
    }
}
