package cn.fanchencloud.kills.service;

import cn.fanchencloud.kills.domain.User;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/1/5
 * Time: 16:41
 * Description: 用户服务
 *
 * @author chen
 */
public interface UserService {

    /**
     * 根据用户id查询用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    public User getUserById(int id);

    /**
     * 添加一个用户信息
     * @param user 用户信息
     */
    boolean insertUser(User user);
}
