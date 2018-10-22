package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.dao.UserRepository;
import com.example.springdatajpa.entity.SysUser;


import javax.annotation.Resource;
import java.util.List;

public class SysUserServiceImpl implements SysUserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public SysUser save(SysUser sysUser) {
        return userRepository.save(sysUser);
    }

    @Override
    public List<SysUser> findByNickNameContains(String nickname) {
        return userRepository.findByNickNameContains(nickname);
    }

    @Override
    public List<SysUser> findAll() {
        return userRepository.findAll();
    }

    @Override
    public SysUser findOne(Long id) {
        return userRepository.findById(id).get();
    }

}
