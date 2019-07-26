package com.liang.admin.service.system;

import com.liang.admin.entity.system.Menu;
import com.liang.admin.service.BaseService;

import java.util.List;

public interface MenuService extends BaseService<Menu> {
    List<Menu> selectUserMenuList(Long id);
}
