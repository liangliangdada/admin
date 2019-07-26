package com.liang.admin.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liuliang
 * @description 首页
 * @date 2019/7/26
 **/
@Controller()
@RequestMapping("home")
public class HomeController {


    @RequestMapping()
    public String home(){
        return "system/home";
    }

}
