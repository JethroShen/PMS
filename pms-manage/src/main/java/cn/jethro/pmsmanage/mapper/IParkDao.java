package cn.jethro.pmsmanage.mapper;

import java.util.List;
import java.util.Map;

import cn.jethro.pmsmanage.pojo.Park;

public interface IParkDao {
    List<Park> queryAll();

    List<Park> queryUserByCarId(Map<String, Object> param);
}
