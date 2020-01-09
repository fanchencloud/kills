package cn.fanchencloud.kills.controller;

import cn.fanchencloud.kills.domain.User;
import cn.fanchencloud.kills.result.Result;
import cn.fanchencloud.kills.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/1/5
 * Time: 16:47
 * Description:
 *
 * @author chen
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    /**
     * 注入用户信息服务类
     */
    private UserService userService;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public Map<String, Object> listArea() {
        Map<String, Object> modelMap = new HashMap<>(2);
        User user = userService.getUserById(1);
        modelMap.put("user", user);
        modelMap.put("total", 3366);
        return modelMap;
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    @Transactional(rollbackFor = Exception.class)
    public Result<Map<String, Object>> addUser() {
        User u1 = new User();
        u1.setUserId(3);
        u1.setUsername("Test1");
        User u2 = new User();
        u2.setUserId(2);
        u2.setUsername("Test2");
        boolean b = userService.insertUser(u2);
        boolean b1 = userService.insertUser(u1);
        Map<String, Object> map = new HashMap<>(3);
        map.put("user1", u1);
        map.put("user2", u2);
        map.put("success", b && b1);
        return Result.success(map);
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
