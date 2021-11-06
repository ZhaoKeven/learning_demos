package com.example.springsecuritydemo.service.impl;

import com.example.springsecuritydemo.model.PermissionEntity;
import com.example.springsecuritydemo.model.RoleEntity;
import com.example.springsecuritydemo.model.UserEntity;
import com.example.springsecuritydemo.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class UserServiceImpl implements IUserService {
    /**
     * 模拟数据库查询
     *
     * @param userName 用户名
     * @return User
     */
    @Override
    public UserEntity getMapByName(String userName) {
        PermissionEntity permissions1 = new PermissionEntity("1", "query");
        PermissionEntity permissions2 = new PermissionEntity("2", "add");
        Set<PermissionEntity> permissionsSet = new HashSet<>();
        permissionsSet.add(permissions1);
        permissionsSet.add(permissions2);
        RoleEntity role = new RoleEntity("1", "admin", permissionsSet);
        Set<RoleEntity> roleSet = new HashSet<>();
        roleSet.add(role);
        UserEntity user = new UserEntity("1", "zsw", "123456", roleSet);
        Map<String, UserEntity> map = new HashMap<>();
        map.put(user.getUsername(), user);

        Set<PermissionEntity> permissionsSet1 = new HashSet<>();
        PermissionEntity permissions3 = new PermissionEntity("3", "delete");
        PermissionEntity permissions4 = new PermissionEntity("4", "update");
        permissionsSet1.add(permissions1);
        permissionsSet1.add(permissions3);
        permissionsSet1.add(permissions4);
        RoleEntity role1 = new RoleEntity("2", "user", permissionsSet1);
        Set<RoleEntity> roleSet1 = new HashSet<>();
        roleSet1.add(role1);
        UserEntity user1 = new UserEntity("2", "admin", "123456", roleSet1);
        map.put(user1.getUsername(), user1);


        PermissionEntity permissions5 = new PermissionEntity("5", "admin");
        permissionsSet1.add(permissions5);
        UserEntity user2 = new UserEntity("2", "admin", "123456", roleSet1);
        map.put(user1.getUsername(), user2);
        return map.get(userName);
    }
}
