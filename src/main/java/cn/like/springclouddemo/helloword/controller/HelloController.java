package cn.like.springclouddemo.helloword.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: like
 * @create: 2018-11-01 10:41
 **/
@RestController
public class HelloController {
    @Value("${my.name}")
    private String name;
    @GetMapping("/hello")
    public String index(){
        return "I'm "+name;
    }
}
