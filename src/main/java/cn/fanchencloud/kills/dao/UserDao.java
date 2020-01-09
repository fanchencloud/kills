package cn.fanchencloud.kills.dao;

import cn.fanchencloud.kills.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/1/5
 * Time: 16:33
 * Description:
 *
 * @author chen
 */
@Mapper
public interface UserDao {

    /**
     * 根据用户id查询用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    @Select("select * from user where userId = #{id}")
    public User getByUserId(int id);

    /**
     * 持久化一个用户信息到数据库中
     *
     * @param user 用户信息
     * @return 添加结果
     */
    @Insert("insert into user(userId, username) VALUES (#{userId},#{username});")
    boolean addUser(User user);
}
