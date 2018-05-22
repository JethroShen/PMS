package cn.jethro.pmsmanage.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jethro.pmsmanage.pojo.Admin;
import cn.jethro.pmsmanage.pojo.Charger;
import cn.jethro.pmsmanage.pojo.Park;
import cn.jethro.pmsmanage.pojo.User;
import cn.jethro.pmsmanage.service.IAdminService;
import cn.jethro.pmsmanage.service.IChargerService;
import cn.jethro.pmsmanage.service.IParkService;
import cn.jethro.pmsmanage.service.IUserService;
import cn.jethro.pmsmanage.utils.JsonUtil;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/admin")
public class AdminController {
    Logger logger = LoggerFactory.getLogger(AdminController.class);
    @Autowired
    private IUserService userService;
    @Autowired
    private IAdminService adminService;
    @Autowired
    private IParkService parkService;
    @Autowired
    private IChargerService chargerService;
    /**
     * 登录
     */
    @RequestMapping("/login")
    @ResponseBody
    public JSONObject login(HttpServletRequest request) {
        logger.debug(" admin login ...");
        String data = request.getParameter("data");
        JSONObject object = new JSONObject();
        Map<String, Object> param = JsonUtil.getMapFromJson(data);
        List<Admin> admin = adminService.getAdmin(param);
        if (admin.size() > 0) {
            object.put("code", 200);
            object.put("message", "success");
            object.put("uid", admin.get(0).getId());
            object.put("username", admin.get(0).getUsername());
            request.getSession().setAttribute("id", admin.get(0).getId());
            request.getSession().setAttribute("username", admin.get(0).getUsername());
        } else {
            object.put("code", 100);
            object.put("message", "用户名密码错误");
        }
        return object;
    }

    /**
     * 用户注册
     */
    @RequestMapping("/register")
    @ResponseBody
    public JSONObject register(HttpServletRequest request) {
        logger.debug("register ...");
        String data = request.getParameter("data");
        JSONObject object = new JSONObject();
        Map<String, Object> param = JsonUtil.getMapFromJson(data);
        int i = userService.addUser(param);
        if (i != 0) {
            object.put("code", 200);
            object.put("message", "注册成功");
        } else {
            object.put("code", 100);
            object.put("message", "注册失败");
        }
        return object;
    }

    /**
     * 修改密码
     */
    @RequestMapping("changepwd")
    @ResponseBody
    public JSONObject changepwd(HttpServletRequest request) {
        logger.debug("changepwd begin ...");
        String data = request.getParameter("data");
        JSONObject object = new JSONObject();
        Map<String, Object> param = JsonUtil.getMapFromJson(data);

        return object;
    }


    /**
     * 查询出入场信细
     */
    @RequestMapping("queryPark")
    @ResponseBody
    public JSONObject queryPark(HttpServletRequest request) {
        JSONObject object = new JSONObject();
        List<Park> parks = parkService.queryAll();
        if (parks.size() != 0) {
            object.put("code", 200);
            object.put("message", "success");
            object.put("parks", parks);
            object.put("size", parks.size());
        }else{
            object.put("code", 100);
            object.put("message", "暂无数据");
        }
        return object;
    }

    /**
     * 查询出入场信细
     */
    @RequestMapping("queryParkByCarId")
    @ResponseBody
    public JSONObject queryParkByCarId(HttpServletRequest request) {
        String data = request.getParameter("data");
        Map<String, Object> param = JsonUtil.getMapFromJson(data);
        JSONObject object = new JSONObject();
        List<Park> parks;
        if (param.get("carId").equals("")) {
            parks = parkService.queryAll();
        }else {
            parks = parkService.queryUserByCarId(param);
        }
        if (parks.size() != 0) {
            object.put("code", 200);
            object.put("message", "success");
            object.put("parks", parks);
            object.put("size", parks.size());
        }else{
            object.put("code", 100);
            object.put("message", "暂无数据");
        }
        return object;
    }

    /**
     * 查询用户信细
     */
    @RequestMapping("queryUser")
    @ResponseBody
    public JSONObject queryUser(HttpServletRequest request) {
        JSONObject object = new JSONObject();
        List<User> users = userService.queryAll();
        if (users.size() != 0) {
            object.put("code", 200);
            object.put("message", "success");
            object.put("users", users);
            object.put("size", users.size());
        }else{
            object.put("code", 100);
            object.put("message", "暂无数据");
        }
        return object;
    }

    /**
     * 按车牌号查询用户信细
     */
    @RequestMapping("queryUserByCarId")
    @ResponseBody
    public JSONObject queryUserByCarId(HttpServletRequest request) {
        String data = request.getParameter("data");
        Map<String, Object> param = JsonUtil.getMapFromJson(data);
        List<User> users ;
        JSONObject object = new JSONObject();
        if (param.get("carId").equals("")) {
            users = userService.queryAll();
        }else {
            users = userService.queryUserByCarId(param);
        }
        if (users.size() != 0) {
            object.put("code", 200);
            object.put("message", "success");
            object.put("users", users);
            object.put("size", users.size());
        }else{
            object.put("code", 100);
            object.put("message", "暂无数据");
        }
        return object;
    }

    /**
     * 查询当前可用车位信息
     */

    /**
     * 查询当前在场信息
     */

    /**
     * 查询计费标准
     */
    @RequestMapping("queryCharger")
    @ResponseBody
    public JSONObject queryCharger(HttpServletRequest request) {
        JSONObject object = new JSONObject();
        List<Charger> chargers = chargerService.queryAll();
        if (chargers.size() != 0) {
            object.put("code", 200);
            object.put("message", "success");
            object.put("chargers", chargers);
            object.put("size", chargers.size());
        }else{
            object.put("code", 100);
            object.put("message", "暂无数据");
        }
        return object;
    }

    /**
     * 查询车辆历史记录
     */
}

