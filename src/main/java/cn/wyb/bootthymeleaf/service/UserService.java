package cn.wyb.bootthymeleaf.service;

import cn.wyb.bootthymeleaf.model.po.UserPO;

/**
 * Create Time: 2018年04月26日 14:08
 * C@author wyb
 **/
public interface UserService {

    UserPO getUser(Integer id);

    Integer save(UserPO user);

    Integer update(UserPO user);
}
