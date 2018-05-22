package cn.jethro.pmsmanage.service;

import java.util.List;
import java.util.Map;

import cn.jethro.pmsmanage.pojo.Admin;

public interface IAdminService {
    List<Admin> getAdmin(Map<String, Object> param);
}
