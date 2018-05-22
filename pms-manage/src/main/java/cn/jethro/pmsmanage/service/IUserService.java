package cn.jethro.pmsmanage.service;

import java.util.List;
import java.util.Map;

import cn.jethro.pmsmanage.pojo.User;

public interface IUserService {
    List<User> getUser(Map<String, Object> param);

    int addUser(Map<String, Object> param);

    List<User> queryAll();

    List<User> queryUserByCarId(Map<String, Object> param);
}
