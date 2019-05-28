package com.yb.producer.service;

import cn.yueshutong.springprojecttree.config.annotation.EnableProjectTree;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注解参数为pointcut表达式
 * 方法调用链分析框架(非官方,某大神做的,给新手用来熟悉项目用的)
 * @author biaoyang
 */
@RestController
@SpringBootApplication
@EnableProjectTree("execution(* com.yb.producer.service.controller..*(..))")
public class ProducerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerServiceApplication.class, args);
    }

}
