package cn.fanchencloud.kills.result;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/1/5
 * Time: 15:16
 * Description: 返回的数据字段和信息
 *
 * @author chen
 */
public class CodeMessage {
    /**
     * 字段标识码
     */
    private int code;
    /**
     * 返回的信息
     */
    private String message;

    //通用异常
    public static CodeMessage SUCCESS = new CodeMessage(200, "success");
    public static CodeMessage SERVER_ERROR = new CodeMessage(500100, "服务端异常");
    //登录模块 5002XX

    //商品模块 5003XX

    //订单模块 5004XX

    //秒杀模块 5005XX


    private CodeMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
