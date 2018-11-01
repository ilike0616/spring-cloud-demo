package cn.like.springclouddemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @program: spring-cloud-demo
 * @description: 自定义配置文件的赋值
 * @author: like
 * @create: 2018-11-01 13:27
 **/
@Configuration
@PropertySource(value = "classpath:user.properties")
@ConfigurationProperties(prefix = "cn.like")
public class User {
    private String name;
    private String qq;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
}
