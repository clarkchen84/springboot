package sizhe.chen.springboot.aop.bean;

import lombok.Data;
import sizhe.chen.springboot.aop.MessageEnum;

/**
 * @ClassName : Result
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-24 07:19
 */
@Data
public class Result<T> {
    private Integer code;

    private String message;

    private T data;

    public static Result sucess() {
        return sucess(null);
    }

    public static Result sucess(Object data) {
        Result result = new Result();
        result.setMessage(MessageEnum.SUCCESS.getMessage());
        result.setCode(MessageEnum.SUCCESS.getCode());
        result.setData(data);
        return result;
    }

    public static Result error(Integer code, String message) {
        Result result = new Result();
        result.setMessage(message);
        result.setCode(code);
        return result;
    }


}
