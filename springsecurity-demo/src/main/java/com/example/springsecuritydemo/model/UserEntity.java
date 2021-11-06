package com.example.springsecuritydemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class UserEntity {
    private String id;
    private String username;
    private String loginName;
    private String password;
    private String email;
    private String phone;
    private String sex;

    /**
     * 用户对应的角色集合
     */
    private Set<RoleEntity> roles;

    public UserEntity(){};
    public UserEntity(String id, String username, String loginName, String password) {
        this.id = id;
        this.username = username;
        this.loginName = loginName;
        this.password = password;
    }
    public UserEntity(String id, String username, String password,Set<RoleEntity> roles) {
        this.id = id;
        this.username = username;
        this.loginName = username;
        this.password = password;
        this.roles = roles;
    }
}
