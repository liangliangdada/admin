package com.liang.admin.entity.system;

import com.liang.admin.entity.BaseEntity;

public class User extends BaseEntity {

    private static final long serialVersionUID = 4925593676519946467L;

    private String username;

    private String password;

    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
