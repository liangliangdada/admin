package com.liang.admin.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liang
 * @description login
 * @date 2019/7/25
 **/
@Controller
@RequestMapping("login")
public class LoginController {

    @RequestMapping("")
    public String login(){
        return "system/login";
    }


}
