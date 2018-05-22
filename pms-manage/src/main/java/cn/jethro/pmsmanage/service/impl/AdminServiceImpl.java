package cn.jethro.pmsmanage.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import cn.jethro.pmsmanage.mapper.IAdminDao;
import cn.jethro.pmsmanage.pojo.Admin;
import cn.jethro.pmsmanage.service.IAdminService;

@Service("adminService")
public class AdminServiceImpl implements IAdminService{
    private IAdminDao adminDao;
    public List<Admin> getAdmin(Map<String, Object> param) {
        return adminDao.getAdmin(param);
    }

}
