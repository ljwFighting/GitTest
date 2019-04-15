package com.ljw.upgrade.service;

import com.ljw.upgrade.pojo.AuthUser;

import java.util.List;

public interface AuthUserService {

    int deleteByPrimaryKey(String id);

    int insert(AuthUser record);

    AuthUser selectByPrimaryKey(String id);

    List<AuthUser> selectAll();

    List<AuthUser> select(String jisuan);

    int updateByPrimaryKey(AuthUser record);

}
