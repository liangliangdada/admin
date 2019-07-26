package com.liang.admin.service.system;

import com.liang.admin.entity.system.User;
import com.liang.admin.service.BaseService;

public interface UserService extends BaseService<User> {

    User selectUserByUserName(String username);
}
