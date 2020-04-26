package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * @Classname DemoService
 * @Description TODO
 * @Date 2020/4/24 11:21
 * @Created by corey
 */
public interface DemoService {

    /**
     * @param id
     * @return
     */
    List<String> getPermissions(Long id);
}
