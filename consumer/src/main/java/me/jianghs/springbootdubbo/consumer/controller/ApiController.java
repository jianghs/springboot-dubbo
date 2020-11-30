package me.jianghs.springbootdubbo.consumer.controller;

import me.jianghs.springbootdubbo.provider.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

/**
 * @className: ApiController
 * @description:
 * @author: jianghs430
 * @createDate: 2020/11/30 16:17
 * @version: 1.0
 */
@RestController
@RequestMapping("api")
public class ApiController {
    @DubboReference(version = "1.0.0")
    private DemoService demoService;

    @GetMapping("test")
    public String test(@RequestParam("name") String name) {
        return  demoService.sayHello(name);
    }
}
