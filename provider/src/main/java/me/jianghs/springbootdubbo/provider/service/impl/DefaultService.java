package me.jianghs.springbootdubbo.provider.service.impl;

import me.jianghs.springbootdubbo.provider.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @className: DefaultService
 * @description:
 * @author: jianghs430
 * @createDate: 2020/11/30 13:26
 * @version: 1.0
 */
@DubboService(version = "1.0.0")
public class DefaultService implements DemoService {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String sayHello(String name) {
        logger.info("当前用户为：" + name);
        return name + ": say hello";
    }
}
