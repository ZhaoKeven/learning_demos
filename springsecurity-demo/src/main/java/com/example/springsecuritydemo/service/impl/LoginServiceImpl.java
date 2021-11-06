package com.example.springsecuritydemo.service.impl;

import com.example.springsecuritydemo.model.UserEntity;
import com.example.springsecuritydemo.service.ILoginService;
import com.example.springsecuritydemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private IUserService userService;

    @Override
    public UserEntity getUserByName(String getMapByName) {
        return userService.getMapByName(getMapByName);
    }


}
