package com.example.springdatajpa.service.impl;


import com.example.springdatajpa.entity.SysUser;

import java.util.List;

public interface SysUserService {
    /**
     * 插入数据
     * @param sysuser
     * @return
     */
    SysUser save(SysUser sysuser);

    /**
     * 根据账号查询
     * @param account
     * @return
     */
    List<SysUser>  findByNickNameContains(String account);

    /**
     * 查询所有用户
     * @return
     */
    List<SysUser> findAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    SysUser findOne (Long id);




}
