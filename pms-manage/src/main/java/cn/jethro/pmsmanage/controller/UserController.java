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

import cn.jethro.pmsmanage.pojo.User;
import cn.jethro.pmsmanage.service.IUserService;
import cn.jethro.pmsmanage.utils.JsonUtil;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private IUserService userService;

    /**
     * 登录
     */
    @RequestMapping("/login")
    @ResponseBody
    public JSONObject login(HttpServletRequest request) {
        logger.debug("login ...");
        String data = request.getParameter("data");
        JSONObject object = new JSONObject();
        Map<String, Object> param = JsonUtil.getMapFromJson(data);
        List<User> users = userService.getUser(param);
        if (users.size() > 0) {
            object.put("code", 200);
            object.put("message", "success");
            object.put("uid", users.get(0).getId());
            object.put("username", users.get(0).getUsername());
            object.put("carId", users.get(0).getCarId());
            request.getSession().setAttribute("id",users.get(0).getId());
            request.getSession().setAttribute("cardId",users.get(0).getCarId());
            request.getSession().setAttribute("username",users.get(0).getUsername());
        }else{
            object.put("code", 100);
            object.put("message", "用户名密码错误");
        }
        return object;
    }


    @RequestMapping("index")
    public String index(){
		return "login";
    	
    }


    /**
     * 查询出入场信细
     */

    /**
     * 查询当前可用车位信息
     */

    /**
     * 查询当前在场信息
     */

    /**
     * 查询计费标准
     */

    /**
     * 查询车辆历史记录
     */
}

