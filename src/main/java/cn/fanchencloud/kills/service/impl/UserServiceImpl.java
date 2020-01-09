package cn.fanchencloud.kills.service.impl;

import cn.fanchencloud.kills.dao.UserDao;
import cn.fanchencloud.kills.domain.User;
import cn.fanchencloud.kills.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/1/5
 * Time: 16:45
 * Description:
 *
 * @author chen
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 注入用户信息持久化单元
     */
    private UserDao userDao;

    /**
     * 根据用户id查询用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    @Override
    public User getUserById(int id) {
        return userDao.getByUserId(id);
    }

    @Override
    public boolean insertUser(User user) {
       return userDao.addUser(user);
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
