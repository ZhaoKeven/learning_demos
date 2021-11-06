package com.example.shirodemo.sys.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("t_sys_role")
public class SysRole extends Model {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String code;

    private String description;

    private Set<SysRolePermission> rolePermissions;


}
