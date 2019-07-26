package com.liang.admin.entity.system;

import com.baomidou.mybatisplus.annotation.TableName;
import com.liang.admin.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_user")
@TableName(value = "sys_user")
public class User extends BaseEntity {

    private static final long serialVersionUID = 4925593676519946467L;

    @Column(length = 50)
    private String username;

    private String password;

    private Integer status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
