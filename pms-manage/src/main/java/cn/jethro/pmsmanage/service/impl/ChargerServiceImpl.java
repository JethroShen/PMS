package cn.jethro.pmsmanage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jethro.pmsmanage.mapper.IChargerDao;
import cn.jethro.pmsmanage.pojo.Charger;
import cn.jethro.pmsmanage.service.IChargerService;

@Service("chargerService")
public class ChargerServiceImpl implements IChargerService{
    @Autowired
    private IChargerDao chargerDao;
    public List<Charger> queryAll() {
        return chargerDao.queryAll();
    }
}
