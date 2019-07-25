package com.liang.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 基于layui的统一后台管理系统模板
 * 开发目标：提供给后端项目拿来即用，同时集成shiro权限控制
 * 让程序员可直接开展业务代码编写，无需耗费大量时间、精力去开发基础模板
 */
@SpringBootApplication
@MapperScan("com.liang.admin.mapper")
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
