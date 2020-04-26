package com.alibaba.dubbo.consumer;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname Consumer
 * @Description TODO
 * @Date 2020/4/24 17:27
 * @Created by corey
 */
public class Consumer {

    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer2 start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer2");
        System.out.println(demoService.getPermissions(1L));
    }
}
