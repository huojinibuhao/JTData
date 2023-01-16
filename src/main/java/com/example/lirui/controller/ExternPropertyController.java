package com.example.lirui.controller;

import com.example.lirui.msg.ResponseResult;
import com.example.lirui.service.ExternPropertyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * (ExternProperty)表控制层
 *
 * @author makejava
 * @since 2022-12-12 10:34:15
 */
@RestController
@RequestMapping("BoxedData")
public class ExternPropertyController {
    @Autowired
    private ExternPropertyService externPropertyService;

    @GetMapping("ReceiveBoxedData")
    @ApiOperation("receiveBoxedData")
    public ResponseResult receiveBoxedData(HttpServletRequest request, @RequestBody String map) {
        ResponseResult responseResult = externPropertyService.insertData(request, map);
        return responseResult;
    }
}

