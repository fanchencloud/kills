package cn.fanchencloud.kills.controller;

import cn.fanchencloud.kills.redis.RedisUtil;
import cn.fanchencloud.kills.result.CodeMessage;
import cn.fanchencloud.kills.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/1/5
 * Time: 15:25
 * Description: 测试控制器
 *
 * @author chen
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/helloError")
    @ResponseBody
    public Result<String> helloError() {
        return Result.error(CodeMessage.SERVER_ERROR);
        //return new Result(500102, "XXX");
    }

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/redis")
    @ResponseBody
    public String testRedis() {
        // 访问地址http://127.0.0.1:8080/redis   ， 如果输出“信不信由你”说明成功了
        Object myTest = redisUtil.get("myTest");
        if (null != myTest) {
            return myTest.toString();
        }
        return null;
    }

    @PostConstruct
    public void init() {
        redisUtil.set("myTest", "信不信由你");
    }

}
