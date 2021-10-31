package com.example.shirodemo.service;

import com.example.shirodemo.model.UserEntity;

public interface IUserService {
    UserEntity getMapByName(String userName);
}
