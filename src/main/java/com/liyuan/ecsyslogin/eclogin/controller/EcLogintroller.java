package com.liyuan.ecsyslogin.eclogin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weiyuan on 2019/4/7/007.
 */

@RestController
@RequestMapping(value = "login")
public class EcLogintroller {
    @Value("${server.port}")
    public String port;
    @RequestMapping(value = "login")
    public  String ecLogin() {
        System.out.println(port);
        return "hello";
    }
}
