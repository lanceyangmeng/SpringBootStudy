package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class SysUserServiceImplTest {



        @Test
        public void contextLoads() {
        }

        @Test
        public void initData(){
            SysUser[] users = {

                    new SysUser("19656195@qq.com","1334","乍见之欢",1965),
                    new SysUser("5698726@qq.com","1234","肥肉鱼先生",3596),
                    new SysUser("18652588@qq.com","1235","涅阳三水",6954),
                    new SysUser("63858847@qq.com","1236","搬来的救兵",5822),
                    new SysUser("2963888@qq.com","1237","樱桃先生",456),
                    new SysUser("955689@qq.com","1238","只有一半影子的人",26358),

            };

            for (int i=0;i<users.length;i++){
                SysUserService.save(users[i]);
            }
        }
        @Test
        public void findAll(){
            List<SysUser> users = SysUserService.findAll();
            users.forEach(user -> System.out.println(user));
        }
}