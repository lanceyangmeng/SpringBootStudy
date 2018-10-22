package com.example.springdatajpa.controller;

import com.example.springdatajpa.entity.SysUser;
import com.example.springdatajpa.service.impl.SysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/SysUser")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @GetMapping(value = "/all")
    public List<SysUser> findAll(){
        return sysUserService.findAll();
    }
    @GetMapping(value = "/oneId/{id}")
    public SysUser getOne(@PathVariable("id") Long id){
        return sysUserService.findOne(id);
    }

    @GetMapping(value ="/nickname/{nickname}")
    public List<SysUser> findUerContains(@PathVariable("nickname") String nickname){
        return sysUserService. findByNickNameContains(nickname);
    }
}
