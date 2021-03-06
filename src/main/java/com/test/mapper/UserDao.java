package com.test.mapper;

import com.test.pojo.User;

public interface UserDao {
    int deleteByPrimaryKey(Long id);

    int insert(User user);

    int insertSelective(User user);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);

    int delete(User user);

    boolean oracle(User user);
}