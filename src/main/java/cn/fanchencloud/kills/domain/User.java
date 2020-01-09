package cn.fanchencloud.kills.domain;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/1/5
 * Time: 16:31
 * Description: 用户实体类
 *
 * @author chen
 */
public class User {
    /**
     * 用户ID
     */
    private int userId;
    /**
     * 用户名
     */
    private String username;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
