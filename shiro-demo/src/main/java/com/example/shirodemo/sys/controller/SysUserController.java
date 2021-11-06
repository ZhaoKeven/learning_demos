package com.example.shirodemo.sys.controller;


import com.example.shirodemo.sys.mapper.SysPermissionMapper;
import com.example.shirodemo.sys.mapper.SysRoleMapper;
import com.example.shirodemo.sys.mapper.SysUserMapper;
import com.example.shirodemo.sys.model.SysPermission;
import com.example.shirodemo.sys.model.SysRole;
import com.example.shirodemo.sys.model.SysUser;
import com.example.shirodemo.sys.model.dto.*;
import com.example.shirodemo.sys.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhaoshiwen
 * @since 2021-11-05
 */
@RestController
@RequestMapping("/sys/sys-user")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @GetMapping("/info/{id}")
    public SysUserDTO getUserInfo(@PathVariable String id){
        SysUserDTO sysUserDTO= sysUserService.getUserInfoById(id);
        return sysUserDTO;
    }



    @GetMapping("/r/{userId}")
    public List<UserRoleDTO> getUserRoleInfo(@PathVariable String userId){
        return sysRoleMapper.getUserRoleInfo(userId);
    }

    @GetMapping("/p/{userId}")
    public List<UserRolePermissionDTO> getUserPermissionInfo(@PathVariable String userId){
        return sysPermissionMapper.getUserPermissionInfo(userId);
    }


}
