package com.ljw.upgrade.service.impl;

import com.ljw.upgrade.dao.AuthUserMapper;
import com.ljw.upgrade.pojo.AuthUser;
import com.ljw.upgrade.service.AuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AuthUserServiceImpl implements AuthUserService {

    @Autowired
    private AuthUserMapper authUserMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return authUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AuthUser record) {
        return authUserMapper.insert(record);
    }

    @Override
    public AuthUser selectByPrimaryKey(String id) {
        return authUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<AuthUser> selectAll() {
        return authUserMapper.selectAll();
    }

    @Override
    public List<AuthUser> select(String jiguan) {
        return authUserMapper.select(jiguan);
    }

    @Override
    public int updateByPrimaryKey(AuthUser record) {
        return authUserMapper.updateByPrimaryKey(record);
    }

}
