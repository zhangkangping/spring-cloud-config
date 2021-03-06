package com.example.serverclient02;

import org.bouncycastle.asn1.esf.SPuri;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServerClient02Application {

    public static void main(String[] args) {
        SpringApplication.run(ServerClient02Application.class, args);
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return name + "好！"+ "您的端口号为：" + port;
    }
}
