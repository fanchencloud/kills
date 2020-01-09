package cn.fanchencloud.kills.redis;

import cn.fanchencloud.kills.KillsApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/1/9
 * Time: 8:17
 * Description:
 *
 * @author chen
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {KillsApplication.class})
public class RedisTest {
    /**
     * 注入redis工具类
     */
    private RedisUtil redisUtil;

    @Before
    public void init(){
        redisUtil.set("myTest", "信不信由你");
    }

    @Test
    public void testRedis() {
        // 访问地址http://127.0.0.1:8080/redis   ， 如果输出“信不信由你”说明成功了
        Object myTest = redisUtil.get("myTest");
        if (null != myTest) {
            System.out.println(myTest.toString());
        } else {
            System.out.println("Error");
        }

    }

    @Autowired
    public void setRedisUtil(RedisUtil redisUtil) {
        this.redisUtil = redisUtil;
    }
}
