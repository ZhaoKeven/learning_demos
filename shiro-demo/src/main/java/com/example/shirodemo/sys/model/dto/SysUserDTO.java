package com.example.shirodemo.sys.model.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.example.shirodemo.sys.model.SysPermission;
import com.example.shirodemo.sys.model.SysRole;
import com.example.shirodemo.sys.model.SysUser;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;
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
public class SysUserDTO extends SysUser {
    private List<SysRole> roleList;
    private List<SysPermission> permissionList;
}
