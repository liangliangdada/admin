package com.liang.admin.entity.system;

import com.baomidou.mybatisplus.annotation.TableName;
import com.liang.admin.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author liuliang
 * @description 用户-角色
 * @date 2019/7/26
 **/
@Entity
@Table(name = "sys_user_role")
@TableName(value = "sys_user_role")
public class UserRole extends BaseEntity {

    private Long userId;

    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
