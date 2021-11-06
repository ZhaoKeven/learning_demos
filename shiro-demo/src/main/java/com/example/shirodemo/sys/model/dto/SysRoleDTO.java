package com.example.shirodemo.sys.model.dto;

import com.example.shirodemo.sys.model.SysRole;
import com.example.shirodemo.sys.model.SysUser;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysRoleDTO extends SysRole {
    private String userId;
    private String userName;
    private String userCode;
    private String userDescription;
}
