package com.tiger.common.commodity_common.dao.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
/**
 * <p>
 * 用户表
 * </p>
 *
 * @author tiger
 * @since 2019-12-31
 */
@Data
public class TUser extends Model<TUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id 自增 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户状态  默认为0(启用) 1（禁用)）
     */
    private Integer status;

    @Override
    protected Serializable pkVal() {
        return null;
    }


}
