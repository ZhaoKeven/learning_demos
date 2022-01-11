package com.example.cachedemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity implements Serializable {
    private Long id;
    private String guid;
    private String name;
    private String age;
    private Date createTime;

    public static UserEntity getDefaultUser(){
        UserEntity userEntity =new UserEntity();
        userEntity.setId(Long.valueOf(1));
        userEntity.setGuid(String.valueOf(1));
        userEntity.setName("keven");
        userEntity.setAge(String.valueOf(20));
        userEntity.setCreateTime(new Date());
        return userEntity;
    }


    public static List<UserEntity> getDefaultList(){
        List<UserEntity> list=new ArrayList<>();
        UserEntity user1 =new UserEntity();
        user1.setId(Long.valueOf(1));
        user1.setGuid(String.valueOf(1));
        user1.setName("ZhangSan");
        user1.setAge(String.valueOf(20));
        user1.setCreateTime(new Date());

        UserEntity user2 =new UserEntity();
        user2.setId(Long.valueOf(2));
        user2.setGuid(String.valueOf(2));
        user2.setName("LiSi");
        user2.setAge(String.valueOf(20));
        user2.setCreateTime(new Date());

        UserEntity user3 =new UserEntity();
        user3.setId(Long.valueOf(3));
        user3.setGuid(String.valueOf(3));
        user3.setName("WanWu");
        user3.setAge(String.valueOf(20));
        user3.setCreateTime(new Date());
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }

    public static Map<Long,UserEntity> getDefaultMap(){
        List<UserEntity> list=getDefaultList();
        Map<Long,UserEntity> map=list.stream().collect(Collectors.toMap(UserEntity::getId,a->a,(k1,k2)->k1));
        return map;
    }
}
