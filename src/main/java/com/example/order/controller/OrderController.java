package com.example.order.controller;

import com.example.order.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.StringJoiner;

/**
 * Created by 15995 on 2018/5/11.
 */
@RestController
public class OrderController {

    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/hello")
    public List<String> hello() {
        return helloRemote.getAll();
    }


    @RequestMapping("/test")
    public String test() {
        return "hello welcome test";
    }

}
