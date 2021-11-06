package com.example.shirodemo.sys.service;

import com.example.shirodemo.sys.model.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.shirodemo.sys.model.dto.SysUserDTO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhaoshiwen
 * @since 2021-11-05
 */
public interface ISysUserService extends IService<SysUser> {
    SysUserDTO getUserInfoById(String userId);

    List<SysUser> getUserListInfo(SysUserDTO sysUserDTO);
}
