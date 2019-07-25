package com.liang.admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -2302473802748386849L;

    @TableId(type = IdType.AUTO)
    private Long id;
}
