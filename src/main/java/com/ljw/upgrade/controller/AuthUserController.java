package com.ljw.upgrade.controller;

import com.ljw.upgrade.pojo.AuthUser;
import com.ljw.upgrade.service.AuthUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AuthUserController {

    @Resource
    private AuthUserService authUserService;

    @ResponseBody
    @RequestMapping("/deleteByPrimaryKey.do")
    public int deleteByPrimaryKey(String id) {
        return authUserService.deleteByPrimaryKey(id);
    }

    @ResponseBody
    @RequestMapping("/insert.do")
    public int insert(AuthUser record) {
        return authUserService.insert(record);
    }

    @ResponseBody
    @RequestMapping("/selectByPrimaryKey.do")
    public AuthUser selectByPrimaryKey(String id) {
        return authUserService.selectByPrimaryKey(id);
    }

    @ResponseBody
    @RequestMapping("/selectAll.do")
    public List<AuthUser> selectAll() {
        return authUserService.selectAll();
    }

    @ResponseBody
    @RequestMapping("/select.do")
    public List<AuthUser> selectAll(String jiguan) {
        return authUserService.select(jiguan);
    }

    @ResponseBody
    @RequestMapping("/updateByPrimaryKey.do")
    public int updateByPrimaryKey(AuthUser record) {
        return authUserService.updateByPrimaryKey(record);
    }

}
