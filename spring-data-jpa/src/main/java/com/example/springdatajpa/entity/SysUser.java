package com.example.springdatajpa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class SysUser implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String account;

    @Column(nullable = false)
    private String password;

    private String nickName;

    private Integer fans;

    public SysUser(String account, String password, String nickName, Integer fans) {
        this.account = account;
        this.password = password;
        this.nickName = nickName;
        this.fans = fans;
    }


}
