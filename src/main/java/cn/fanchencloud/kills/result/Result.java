package cn.fanchencloud.kills.result;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/1/5
 * Time: 14:57
 * Description: 返回信息实体类
 *
 * @author chen
 */
public class Result<T> {
    /**
     * 提示码
     */
    private int code;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 返回数据信息
     */
    private T data;

    private Result(T data) {
        this.code = 200;
        this.message = "success";
        this.data = data;
    }

    public Result(CodeMessage codeMessage) {
        if (codeMessage == null) {
            return;
        }
        this.code = codeMessage.getCode();
        this.message = codeMessage.getMessage();
    }

    /**
     * 成功时候的调用
     *
     * @param data 返回数据
     * @param <T>  返回数据类型
     * @return 返回结果
     */
    public static <T> Result<T> success(T data) {
        return new Result<T>(data);
    }

    /**
     * 失败调用
     *
     * @param codeMessage 返回数据
     * @param <T>         返回数据类型
     * @return 返回结果
     */
    public static <T> Result<T> error(CodeMessage codeMessage) {
        return new Result<T>(codeMessage);
    }


    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
