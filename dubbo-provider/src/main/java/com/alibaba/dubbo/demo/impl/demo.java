package com.alibaba.dubbo.demo.impl;

import com.alibaba.fastjson.JSON;

/**
 * @Classname demo
 * @Description TODO
 * @Date 2020/5/19 10:52
 * @Created by corey
 */
public class demo {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory();
        long totalMemory = runtime.totalMemory();
        long maxMemory = runtime.maxMemory();
        boolean ok = (maxMemory - (totalMemory - freeMemory) > 2048); // 剩余空间小于2M报警
        String msg = "Max:" + (maxMemory / 1024 / 1024) + "M, Total:"
                + (totalMemory / 1024 / 1024) + "M, Free:" + (freeMemory / 1024 / 1024)
                + "M, Use:" + ((totalMemory / 1024 / 1024) - (freeMemory / 1024 / 1024)) + "M";
        System.out.println("ok====>"+ok+","+"msg====>"+msg);
    }
}
