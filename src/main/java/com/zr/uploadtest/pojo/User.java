package com.zr.uploadtest.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: gengwei
 * @Date: 2019-07-24 15:02
 * @Description:
 */
@Data
public class User implements Serializable{
    private Integer id;
    private Integer age;
    private String name;

    public User() {
    }

    public User(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
