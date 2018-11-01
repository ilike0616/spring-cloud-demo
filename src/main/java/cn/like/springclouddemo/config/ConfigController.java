package cn.like.springclouddemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: like
 * @create: 2018-11-01 13:11
 **/
@RestController
@EnableConfigurationProperties(ConfigBean.class)
public class ConfigController {
    @Autowired
    ConfigBean configBean;

    @RequestMapping(value = "/config")
    public String index() {
        return configBean.getGreeting() + "-" + configBean.getName() + "-" + configBean.getUuid() + "-" + configBean.getMax();
    }

    @Autowired
    User user;
    @RequestMapping(value = "/user")
    public String user(){
        return user.getName()+":"+user.getQq();
    }
}
