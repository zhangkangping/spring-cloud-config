package com.example.serverzuul;

import com.example.serverzuul.util.LoginFilter;
import org.apache.catalina.filters.RequestFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
//@RestController
public class ServerZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerZuulApplication.class, args);
    }

    @Configuration
    public class Filter {
        @Bean
        public LoginFilter loginFilter() {
            return new LoginFilter();
        }
    }
}

