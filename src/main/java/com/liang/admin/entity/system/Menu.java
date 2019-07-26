package com.liang.admin.entity.system;

import com.baomidou.mybatisplus.annotation.TableName;
import com.liang.admin.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author liuliang
 * @description 菜单资源
 * @date 2019/7/26
 **/
@Entity
@Table(name = "sys_menu")
@TableName(value = "sys_menu")
public class Menu extends BaseEntity {

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String url;

    // 0：目录   1：菜单   2：按钮
    private Integer type;

    private Long parentId;

    //0禁用，1启用
    private Integer status;

    //权限码
    @Column(length = 50)
    private String perCode;

    private Integer sort;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status==null?1:status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPerCode() {
        return perCode;
    }

    public void setPerCode(String perCode) {
        this.perCode = perCode;
    }
}
