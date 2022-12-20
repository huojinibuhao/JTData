package com.example.lirui.controller;

import com.example.lirui.service.MoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * (MoData)表控制层
 *
 * @author makejava
 * @since 2022-12-12 10:18:27
 */
@RestController
@RequestMapping("moData")
public class MoDataController {
    @Autowired
    private MoDataService moDataService;

}

