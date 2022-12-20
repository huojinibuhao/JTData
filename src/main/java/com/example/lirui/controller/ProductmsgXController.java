package com.example.lirui.controller;


import com.example.lirui.service.ITestService;
import com.example.lirui.service.ProductmsgXService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (ProductmsgX)表控制层
 *
 * @author makejava
 * @since 2022-12-09 09:58:23
 */
@RestController
@RequestMapping("productmsgX")
@Api(tags = "ProDuctMsg_X的控制层")
public class ProductmsgXController {
    @Autowired
    private ProductmsgXService productmsgXService;



}

