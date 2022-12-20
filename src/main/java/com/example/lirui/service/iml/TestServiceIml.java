package com.example.lirui.service.iml;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lirui.mapper.UserMapper;
import com.example.lirui.pojo.UserLirui;
import com.example.lirui.pojo.req.UserReq;
import com.example.lirui.service.ITestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Service
@Slf4j
public class TestServiceIml extends ServiceImpl<UserMapper, UserLirui> implements ITestService {
    @Override
    public String addUser(UserReq userReq) {
        boolean save = this.save(UserLirui.builder()
                        .id(userReq.getId())
                .address(userReq.getAddress())
                .name(userReq.getName())
                .build());
        if(save){
            return "SUCCESS";
        }
        return "FAIl";

    }

    @Override
    public String insertData(HttpServletRequest request, Map map) {
        Object data = map.get("data");
        return null;
    }
}
