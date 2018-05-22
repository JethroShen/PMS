package cn.jethro.pmsmanage.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jethro.pmsmanage.mapper.IParkDao;
import cn.jethro.pmsmanage.pojo.Park;
import cn.jethro.pmsmanage.service.IParkService;

@Service("parkService")
public class ParkServiceImpl implements IParkService{
    @Autowired
    private IParkDao parkDao;
    public List<Park> queryAll() {
        return parkDao.queryAll();
    }

    public List<Park> queryUserByCarId(Map<String, Object> param) {
        return parkDao.queryUserByCarId(param);
    }
}
