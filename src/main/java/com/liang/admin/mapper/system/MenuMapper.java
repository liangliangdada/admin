package com.liang.admin.mapper.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liang.admin.entity.system.Menu;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menu> {
    List<Menu> selectUserMenuList(Long id);
}
