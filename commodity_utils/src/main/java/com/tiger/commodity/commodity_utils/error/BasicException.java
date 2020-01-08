package com.tiger.commodity.commodity_utils.error;

import lombok.Data;

/**
 * 自定义异常
 *
 * @author mytiger
 * @date  2020-01-01
 */
@Data
public class BasicException extends  RuntimeException {

    private  int code=0;

    public  BasicException(int  code ,String message)
    {
        super(message);
        this.code=code;

    }

}
