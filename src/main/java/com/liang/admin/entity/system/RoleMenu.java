package com.liang.admin.entity.system;

import com.baomidou.mybatisplus.annotation.TableName;
import com.liang.admin.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author liuliang
 * @description 角色-资源
 * @date 2019/7/26
 **/
@Entity
@Table(name = "sys_role_menu")
@TableName(value = "sys_role_menu")
public class RoleMenu extends BaseEntity {

    private Long roleId;

    private Long menuId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}
