package com.liang.admin.controller.system;

import com.liang.admin.entity.system.PushMessage;
import com.liang.admin.service.system.SocketIOService;
import com.liang.admin.utils.JsonResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author liang
 * @description login
 * @date 2019/7/25
 **/
@Controller
@RequestMapping("login")
public class LoginController {

    @Resource
    private SocketIOService socketIOService;

    @RequestMapping("")
    public String login(){
        return "system/login";
    }

    @RequestMapping("loginto")
    @ResponseBody
    public JsonResult loginto(HttpServletRequest request,String username,String password){
        Subject subject = SecurityUtils.getSubject();
        System.out.println(DigestUtils.md5DigestAsHex(password.getBytes()));
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, DigestUtils.md5DigestAsHex(password.getBytes()));
        try {
            subject.login(usernamePasswordToken);
        }catch (UnknownAccountException e){
            return JsonResult.build(false,"用户不存在！");
        }catch (IncorrectCredentialsException e){
            return JsonResult.build(false,"密码错误！");
        }
        request.getSession().setAttribute("user", subject.getPrincipal());
        return JsonResult.build(true,"登录成功！");
    }

    @RequestMapping("sendMsg")
    public void send(String user,String msg){
        socketIOService.pushMessageToUser(new PushMessage("88","hello io"));
    }


}
