package com.example.lirui.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.lirui.pojo.ExternProperty;
import com.example.lirui.pojo.MoData;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * (ExternProperty)表服务接口
 *
 * @author makejava
 * @since 2022-12-12 10:34:17
 */
public interface ExternPropertyService extends IService<ExternProperty> {

    String insertData(HttpServletRequest request, String map);
}
