package com.example.shirodemo.service.impl;

import com.example.shirodemo.model.UserEntity;
import com.example.shirodemo.service.ILoginService;
import com.example.shirodemo.service.IUserService;
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
