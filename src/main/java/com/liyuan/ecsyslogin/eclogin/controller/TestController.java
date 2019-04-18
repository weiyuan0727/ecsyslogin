package com.liyuan.ecsyslogin.eclogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weiyuan on 2019/4/7/007.
 */
@RestController
public class TestController {
    @Value("${server.port}")
    String getPort;
    @Autowired
    private DiscoveryClient client;
    @RequestMapping("tet")
    public  String tet() {
        return "11";
    }

    
    @GetMapping("/testzuul")
    public String testzuul() {
        System.out.println("host:" + getPort+ "   -----port:" );
        return " ------      host:" +getPort;
    }


}
