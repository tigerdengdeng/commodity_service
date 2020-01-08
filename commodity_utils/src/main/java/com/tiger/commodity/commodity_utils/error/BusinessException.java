package com.tiger.commodity.commodity_utils.error;

import lombok.Data;

/**
 * 业务异常
 *
 * @author mytiger
 * @date 2020-01-07
 */
@Data
public class BusinessException  extends BasicException{

    public  BusinessException(int code ,String message){

        super(code,message);
    }

}
