package com.example.shirodemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class RoleEntity {

    private String id;
    private String roleName;
    /**
     * 角色对应权限集合
     */
    private Set<PermissionEntity> permissions;
}
