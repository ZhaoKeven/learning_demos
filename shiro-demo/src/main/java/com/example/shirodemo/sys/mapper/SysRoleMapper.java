package com.example.shirodemo.sys.mapper;

import com.example.shirodemo.sys.model.SysRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shirodemo.sys.model.dto.SysRoleDTO;
import com.example.shirodemo.sys.model.dto.UserRoleDTO;
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
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<UserRoleDTO> getUserRoleInfo(@Param("userId") String userId);

    List<UserRoleDTO> getUserRoleList(SysRoleDTO roleUserDTO);

    List<SysRole> getRoleList(SysRoleDTO roleUserDTO);
}
