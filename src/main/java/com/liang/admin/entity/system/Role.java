package com.liang.admin.entity.system;

import com.baomidou.mybatisplus.annotation.TableName;
import com.liang.admin.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author liuliang
 * @description 角色
 * @date 2019/7/26
 **/
@Entity
@Table(name = "sys_role")
@TableName(value = "sys_role")
public class Role extends BaseEntity {

    @Column(length = 50)
    private String name;

    //描述
    private String description;

    private Integer status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
