package cn.jethro.pmsmanage.mapper;

import java.util.List;
import java.util.Map;

import cn.jethro.pmsmanage.pojo.User;

public interface IUserDao {

    List<User> getUser(Map<String, Object> param);

   int addUser(Map<String, Object> param);

    List<User> findAll();

    List<User> queryUserByCarId(Map<String, Object> param);
}
