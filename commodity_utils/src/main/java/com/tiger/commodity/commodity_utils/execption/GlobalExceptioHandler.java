package com.tiger.commodity.commodity_utils.execption;

import com.tiger.commodity.commodity_utils.common.vo.BaseResponseVO;
import com.tiger.commodity.commodity_utils.error.BasicException;
import com.tiger.commodity.commodity_utils.error.ExceptionEntity;
import com.tiger.commodity.commodity_utils.responsecode.ResponseCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.BindException;

/**
 * 全局异常控制类
 *
 * @author mytiger
 * @date 2020-01-07
 */

//全局异常类 注解
@ControllerAdvice
//以JSON格式返回
@ResponseBody
//日志记录
@Slf4j
public class GlobalExceptioHandler {

    private ExceptionEntity ex = new ExceptionEntity();

    /**
     * 404异常处理
     */
    @ExceptionHandler(value = NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Object errorHandler(HttpServletRequest request, NoHandlerFoundException exception, HttpServletResponse response) {
        log.error("404异常"+exception.getMessage());
        ex.setCode(ResponseCode.ERROR_404.getCode());
        ex.setMessage(ResponseCode.ERROR_404.getMessage());
        return ex;


    }

    /**
     * 405异常处理
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Object errorHandler(HttpServletRequest request, HttpRequestMethodNotSupportedException exception, HttpServletResponse response) {
        log.error("405异常"+exception.getMessage());
        ex.setCode(ResponseCode.ERROR_405.getCode());
        ex.setMessage(ResponseCode.ERROR_405.getMessage());
        return ex;
    }

    /**
     * 415异常处理
     */
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public Object errorHandler(HttpServletRequest request, HttpMediaTypeNotSupportedException exception, HttpServletResponse response) {
        log.error("415异常"+exception.getMessage());
        ex.setCode(ResponseCode.ERROR_500.getCode());
        ex.setMessage(ResponseCode.ERROR_500.getMessage());
        return ex;
    }

    /**
     * 500异常处理
     */
//    @ExceptionHandler(value = Exception.class)
//    public Object errorHandler(HttpServletRequest request, Exception exception, HttpServletResponse response) {
//        log.error("500异常"+exception.getMessage());
//        ex.setCode(ResponseCode.ERROR_500.getCode());
//        ex.setMessage(ResponseCode.ERROR_500.getMessage());
//        return ex;
//    }

    /**
     * 业务异常处理
     */
    @ExceptionHandler(value = BasicException.class)
    private Object errorHandler(HttpServletRequest request, BasicException exception, HttpServletResponse response) {
        log.error("业务异常处理"+exception.getMessage());
        ex.setCode(ResponseCode.ERROR_500.getCode());
        ex.setMessage(ResponseCode.ERROR_500.getMessage());
        return ex;
    }

    /**
     * 数据验证异常处理
     *
     * @param request
     * @param exception
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Object MethodArgumentNotValidHandler(HttpServletRequest request, MethodArgumentNotValidException exception) {
        log.error("数据验证异常处理" + exception.getBindingResult().getFieldError().getDefaultMessage());
        ex.setCode(ResponseCode.ERROR_400.getCode());
        ex.setMessage(exception.getBindingResult().getFieldError().getDefaultMessage());
        return ex;
    }

}
