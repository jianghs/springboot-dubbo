package me.jianghs.springbootdubbo.consumer;

import me.jianghs.springbootdubbo.provider.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/**
 * @className: ConsumerStart
 * @description:
 * @author: jianghs430
 * @createDate: 2020/11/30 13:15
 * @version: 1.0
 */
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
