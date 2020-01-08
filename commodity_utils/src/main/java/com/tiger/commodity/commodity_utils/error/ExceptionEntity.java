package com.tiger.commodity.commodity_utils.error;

import lombok.Data;

import java.io.Serializable;

/**
 * 全局异常 错误 信息实体
 *
 * @author mytiger
 * @date 2020-01-07
 */
@Data
public class ExceptionEntity implements Serializable {
    /*
    错误 信息
     */
    private String message;
    /**
     * 错误编码
     */
    private int code;

}
