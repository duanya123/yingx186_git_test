package com.baizhi.yingx186_git_test.dao;

import com.baizhi.yingx186_git_test.entity.User;

import java.util.List;

public interface UserDao {
    List<User> queryAll();
    User findById(int id);
    User findByName(String name);
    User findByIdAndName(int id,String name);
}
