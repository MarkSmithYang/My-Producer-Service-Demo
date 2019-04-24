package com.yb.producer.service.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * author biaoyang
 * date 2019/4/10 001014:45
 */
@RefreshScope
@Api(tags = "我的服务提供接口")
@RestController
@CrossOrigin//处理跨域
public class ProducerServiceController {
    //用于feign-ribbon-hystrix的服务接口

    //@Value("${producer.test}")
    private String test="哎哎哎";

    @ApiOperation("我的hello")
    @GetMapping("/hello")
    public String hello( @ApiParam(name = "name",value = "姓名") @RequestParam String name){
        return "hello "+name+"==="+test;
    }

    @ApiOperation("我的world")
    @GetMapping("/world")
    public String world(){
        return "hello world----啊啊=-="+test;
    }

}
