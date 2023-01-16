package com.example.lirui.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.lirui.msg.ResponseResult;
import com.example.lirui.pojo.ExternProperty;

import javax.servlet.http.HttpServletRequest;

/**
 * (ExternProperty)表服务接口
 *
 * @author makejava
 * @since 2022-12-12 10:34:17
 */
public interface ExternPropertyService extends IService<ExternProperty> {

    ResponseResult insertData(HttpServletRequest request, String map);
}
