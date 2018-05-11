package com.example.order.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 15995 on 2018/5/11.
 */
@FeignClient(name= "user-server")
public interface HelloRemote {

    @RequestMapping(value = "/user/getAll")
    List<String> getAll();
}
