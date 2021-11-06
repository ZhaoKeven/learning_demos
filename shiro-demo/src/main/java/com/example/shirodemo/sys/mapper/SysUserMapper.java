package com.example.shirodemo.sys.mapper;

import com.example.shirodemo.sys.model.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shirodemo.sys.model.dto.SysUserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhaoshiwen
 * @since 2021-11-05
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    SysUserDTO getUserInfo(@Param("id") String id);

    List<SysUser> getUserListInfo();
}
