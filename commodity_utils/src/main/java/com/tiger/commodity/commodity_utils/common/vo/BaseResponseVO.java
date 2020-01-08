package com.tiger.commodity.commodity_utils.common.vo;

import com.tiger.commodity.commodity_utils.execption.BaseExceptionHandler;
import com.tiger.commodity.commodity_utils.responsecode.ResponseCode;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.io.Serializable;

/**
 * JSON 自定义返回
 *
 * @author mytiger
 * @date 2019-12-21
 */
@Data
@Component
public class BaseResponseVO<T>  implements Serializable {

    private T data;
    private String code;
    private String msg;
    private String token;

    /**
     * 若没有数据返回，默认状态码为 0，提示信息为“操作成功！”
     */
    public BaseResponseVO() {
        this.code = "0";
        this.msg = "操作成功！";
    }

    /**
     * 若没有数据返回，可以人为指定状态码和提示信息
     *
     * @param code
     * @param msg
     */
    public BaseResponseVO(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 有数据返回时，状态码为 0，默认提示信息为“操作成功！”
     *
     * @param data
     */
    public BaseResponseVO(T data) {
        this.data = data;
        this.code = "0";
        this.msg = "操作成功！";
    }

    /**
     * 有数据返回，状态码为 0，人为指定提示信息
     *
     * @param data
     * @param msg
     */
    public BaseResponseVO(T data, String msg) {
        this.data = data;
        this.code = "0";
        this.msg = msg;

    }

    /**
     * 有数据返回，状态码为 0，人为指定提示信息
     *
     * @param data
     * @param msg
     */
    public BaseResponseVO(T data, String msg, String token) {
        this.data = data;
        this.code = "0";
        this.msg = msg;
        this.token = token;
    }


    /**
     * 全局异常
     * @param exception  异常
     */
    public BaseResponseVO(MethodArgumentNotValidException exception) {
        this.code = ResponseCode.ERROR_500.getCode().toString();
        this.msg = exception.getBindingResult().getFieldError().getDefaultMessage();
    }

    /**
     * 全局异常
     * @param exception  异常
     */
    public BaseResponseVO(Exception exception) {
        this.code = ResponseCode.ERROR_500.getCode().toString();
        this.msg =ResponseCode.ERROR_500.getMessage();
    }
}

