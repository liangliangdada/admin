package com.liang.admin.controller.system;

import com.liang.admin.entity.system.Menu;
import com.liang.admin.entity.system.User;
import com.liang.admin.service.system.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author liuliang
 * @description 首页
 * @date 2019/7/26
 **/
@Controller()
@RequestMapping("home")
public class HomeController {


    @Resource
    private MenuService menuService;


    @RequestMapping()
    public String home(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        List<Menu> menuList = menuService.selectUserMenuList(user.getId());
        request.setAttribute("menuList", menuList);
        return "system/main";
    }

    @RequestMapping("index")
    public String myHome(){
        return "system/home";
    }

}
