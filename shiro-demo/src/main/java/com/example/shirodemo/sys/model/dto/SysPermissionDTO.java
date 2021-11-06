package com.example.shirodemo.sys.model.dto;

import com.example.shirodemo.sys.model.SysPermission;
import com.example.shirodemo.sys.model.SysRole;
import com.example.shirodemo.sys.model.SysUser;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

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
public class SysPermissionDTO extends SysPermission {
    private String userId;
    private String userName;
    private String userCode;
    private String userDescription;
    private String roleId;
    private String roleName;
    private String roleCode;
    private String roleDescription;
}
