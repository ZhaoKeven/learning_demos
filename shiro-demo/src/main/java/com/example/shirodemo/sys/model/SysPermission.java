package com.example.shirodemo.sys.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
@TableName("t_sys_permission")
public class SysPermission extends Model {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String code;

    private String description;


}
