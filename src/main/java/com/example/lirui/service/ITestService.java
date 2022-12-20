package com.example.lirui.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.lirui.pojo.UserLirui;
import com.example.lirui.pojo.req.UserReq;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface ITestService extends IService<UserLirui> {
    String addUser(UserReq userReq);

    String insertData(HttpServletRequest request, Map map);
}
