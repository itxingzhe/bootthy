package cn.wyb.bootthymeleaf.service;

import cn.wyb.bootthymeleaf.dao.UserDao;
import cn.wyb.bootthymeleaf.model.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Create Time: 2018年04月26日 14:15
 * C@author wyb
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserPO getUser(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public Integer save(UserPO user) {

        return userDao.insertSelective(user);
    }

    @Override
    @Transactional
    public Integer update(UserPO user) {
        return userDao.updateByPrimaryKeySelective(user);
    }
}
