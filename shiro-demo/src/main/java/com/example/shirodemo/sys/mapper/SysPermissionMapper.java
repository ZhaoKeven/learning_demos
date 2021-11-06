package com.example.shirodemo.sys.mapper;

import com.example.shirodemo.sys.model.SysPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shirodemo.sys.model.SysUser;
import com.example.shirodemo.sys.model.dto.SysPermissionDTO;
import com.example.shirodemo.sys.model.dto.UserRolePermissionDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhaoshiwen
 * @since 2021-11-05
 */
public interface SysPermissionMapper extends BaseMapper<SysPermission> {
    List<UserRolePermissionDTO> getUserPermissionInfo(@Param("userId") String userId);
    List<UserRolePermissionDTO> getUserPermissionList(SysPermissionDTO SysPermissionDTO);

    List<SysPermission> getPermissionList(SysPermissionDTO sysPermissionDTO);
}
