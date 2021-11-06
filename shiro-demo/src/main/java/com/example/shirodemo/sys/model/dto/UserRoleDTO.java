package com.example.shirodemo.sys.model.dto;

import com.example.shirodemo.sys.model.SysUser;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class UserRoleDTO extends SysUser {
    private String roleId;
    private String roleName;
    private String roleCode;
    private String roleDescription;
}
