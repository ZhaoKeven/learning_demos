package com.example.shirodemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    private String id;
    private String username;
    private String loginName;
    private String password;
    private String idNum;
    private String email;
    private String phone;
    private String sex;

    /**
     * 用户对应的角色集合
     */
    private Set<RoleEntity> roles;

    public UserEntity(String id, String username, String password,Set<RoleEntity> roles) {
        this.id = id;
        this.username = username;
        this.loginName = username;
        this.password = password;
        this.roles = roles;
    }
}
