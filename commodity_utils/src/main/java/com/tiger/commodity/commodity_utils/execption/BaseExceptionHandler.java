package com.tiger.commodity.commodity_utils.execption;


import com.tiger.commodity.commodity_utils.common.vo.BaseResponseVO;
import com.tiger.commodity.commodity_utils.responsecode.ResponseCode;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.naming.CommunicationException;
import javax.servlet.http.HttpServletRequest;

/**
 * 公共异常处理 返回
 *
 * @author mytiger
 * @date 2020-01-02 18:14
 */
//全局异常类 注解
@ControllerAdvice
//以JSON格式返回
@ResponseBody
//日志记录
@Slf4j
public class BaseExceptionHandler {
//    @ExceptionHandler(value = MethodArgumentNotValidException.class)
//    public Object MethodArgumentNotValidHandler(HttpServletRequest request, MethodArgumentNotValidException exception) throws Exception {
//        log.error("异常日志" + exception.getBindingResult().getFieldError().getDefaultMessage());
//        return new BaseResponseVO(exception);
//    }
//
//
//    @ExceptionHandler(Exception.class)
//    public Object errorExceptionHandle(Exception e, HttpServletRequest request) {
//        boolean isAjax = isAjax(request);
//        if (isAjax) {
//            log.error("Ajax 请求异常" + e.getMessage());
//            return new BaseResponseVO(e);
//        } else {
//            log.error("界面请求异常" + e.getMessage());
//            //业务异常
//            return new BaseResponseVO(e);
//        }
//
//    }
//    /**
//     * 判断网络请求是否为ajax
//     *
//     * @param req
//     * @return
//     */
//    private boolean isAjax(HttpServletRequest req) {
//        String contentTypeHeader = req.getHeader("Content-Type");
//        String acceptHeader = req.getHeader("Accept");
//        String xRequestedWith = req.getHeader("X-Requested-With");
//        return (contentTypeHeader != null && contentTypeHeader.contains("application/json"))
//                || (acceptHeader != null && acceptHeader.contains("application/json"))
//                || "XMLHttpRequest".equalsIgnoreCase(xRequestedWith);
//    }

}




