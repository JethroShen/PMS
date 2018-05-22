package cn.jethro.pmsmanage.service;

import java.util.List;
import java.util.Map;

import cn.jethro.pmsmanage.pojo.Park;

public interface IParkService {
    List<Park> queryAll();

    List<Park> queryUserByCarId(Map<String, Object> param);
}
