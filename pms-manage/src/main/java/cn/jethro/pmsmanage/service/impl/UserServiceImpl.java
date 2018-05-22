package cn.jethro.pmsmanage.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jethro.pmsmanage.mapper.IUserDao;
import cn.jethro.pmsmanage.pojo.User;
import cn.jethro.pmsmanage.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    public List<User> getUser(Map<String, Object> param) {
        return userDao.getUser(param);
    }

    public int addUser(Map<String, Object> param) {
        return userDao.addUser(param);
    }

    public List<User> queryAll() {
        return userDao.findAll();
    }

    public List<User> queryUserByCarId(Map<String, Object> param) {
        return userDao.queryUserByCarId(param);
    }
}
