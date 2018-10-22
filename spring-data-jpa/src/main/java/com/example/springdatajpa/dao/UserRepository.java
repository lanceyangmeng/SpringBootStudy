package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<SysUser , Long> {

//    //根据账号查找
//    List<SysUser> findByAccount(String accout);
//
//
//    //昵称关键词查询
//   // List<SysUser> findByNickNameContains(String keywords);
//
//    //昵称
//    List<SysUser> findByNickName(String nickname);
//
//
//    //昵称关键词 粉丝 降序
//    @Query(" from  SysUser  u where u.nickName like  %:nickname% order by u.fans desc")
//    List<SysUser> findUserContains(@Param("nickname") String nickname);
//

    List<SysUser> findByNickNameContains(String keywords);


    @Query("from User u where  u.nickName =:nickname")
    SysUser findUser(@Param("nickname") String nickname);

    @Query(" from  User  u where u.nickName like  %:nickname% order by u.fans desc")
    List<SysUser> findUserContains(@Param("nickname") String nickname);




}
