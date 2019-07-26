package com.liang.admin.service.impl.system;

import com.liang.admin.entity.system.Menu;
import com.liang.admin.mapper.system.MenuMapper;
import com.liang.admin.service.impl.BaseServiceImpl;
import com.liang.admin.service.system.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liuliang
 * @description 菜单
 * @date 2019/7/26
 **/
@Service
public class MenuServiceImpl extends BaseServiceImpl<MenuMapper, Menu> implements MenuService {


    @Resource
    private MenuMapper menuMapper;

    @Override
    public List<Menu> selectUserMenuList(Long id) {
        return menuMapper.selectUserMenuList(id);
    }
}
