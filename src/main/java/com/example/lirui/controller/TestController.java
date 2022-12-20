package com.example.lirui.controller;


import com.example.lirui.pojo.req.UserReq;
import com.example.lirui.service.ITestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@Api(tags = "测试接口接口")
public class TestController {
    @Autowired
    private ITestService testService;
    @PostMapping(value = "addUser")
    @ApiOperation("测试")
    public String addUser(HttpServletRequest request, @RequestBody UserReq userReq){
       return testService.addUser(userReq);
    }

    @PostMapping(value = "parseJson")
    @ApiOperation("测试")
    public String parseJson(HttpServletRequest request, @RequestBody Map map){
        //JSONObject jsonObject = JSONObject.parseObject(json);
        String success = testService.insertData(request,map);
        System.out.println(map);
        return "Success";
    }
}
