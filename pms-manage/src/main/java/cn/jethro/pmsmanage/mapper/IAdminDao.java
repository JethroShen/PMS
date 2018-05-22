package cn.jethro.pmsmanage.mapper;

import java.util.List;
import java.util.Map;

import cn.jethro.pmsmanage.pojo.Admin;

public interface IAdminDao {
    List<Admin> getAdmin(Map<String, Object> param);
}
