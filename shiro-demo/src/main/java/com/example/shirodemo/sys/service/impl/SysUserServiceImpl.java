package com.example.shirodemo.sys.service.impl;

import com.example.shirodemo.sys.mapper.SysPermissionMapper;
import com.example.shirodemo.sys.mapper.SysRoleMapper;
import com.example.shirodemo.sys.model.SysPermission;
import com.example.shirodemo.sys.model.SysRole;
import com.example.shirodemo.sys.model.SysUser;
import com.example.shirodemo.sys.mapper.SysUserMapper;
import com.example.shirodemo.sys.model.dto.SysPermissionDTO;
import com.example.shirodemo.sys.model.dto.SysRoleDTO;
import com.example.shirodemo.sys.model.dto.SysUserDTO;
import com.example.shirodemo.sys.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaoshiwen
 * @since 2021-11-05
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public SysUserDTO getUserInfoById(String userId) {
        SysUserDTO sysUserDTO= sysUserMapper.getUserInfo(userId);
        if(sysUserDTO==null){
            return null;
        }
        SysRoleDTO roleDto=new SysRoleDTO();
        roleDto.setUserId(sysUserDTO.getId());
        List<SysRole> roleList=sysRoleMapper.getRoleList(roleDto);
        sysUserDTO.setRoleList(roleList);

        SysPermissionDTO sysPermissionDTO=new SysPermissionDTO();
        sysPermissionDTO.setUserId(sysUserDTO.getId());
        List<SysPermission> permissionList=sysPermissionMapper.getPermissionList(sysPermissionDTO);
        sysUserDTO.setPermissionList(permissionList);

        return sysUserDTO;
    }

    @Override
    public List<SysUser> getUserListInfo(SysUserDTO sysUserDTO) {
        return null;
    }


}
