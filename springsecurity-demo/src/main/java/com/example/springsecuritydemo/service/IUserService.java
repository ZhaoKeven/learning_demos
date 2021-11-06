package com.example.springsecuritydemo.service;

import com.example.springsecuritydemo.model.UserEntity;

public interface IUserService {
    UserEntity getMapByName(String userName);
}
