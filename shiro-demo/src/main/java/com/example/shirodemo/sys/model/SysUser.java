package com.example.shirodemo.sys.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.beans.Transient;
import java.util.Set;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhaoshiwen
 * @since 2021-11-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_sys_user")
public class SysUser extends Model {

    private static final long serialVersionUID = 1L;
    @TableId
    private String id;

    private String username;

    @TableField("login_name")
    private String loginName;

    private String password;

    private String idNum;

    private String phone;

    private String email;

    private String sex;
}
