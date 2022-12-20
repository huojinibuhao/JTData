package com.example.lirui.service.iml;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lirui.mapper.ExternPropertyMapper;
import com.example.lirui.mapper.MoDataMapper;
import com.example.lirui.pojo.ExternProperty;
import com.example.lirui.pojo.MoData;
import com.example.lirui.service.ExternPropertyService;
import com.example.lirui.service.MoDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (MoData)表服务实现类
 *
 * @author makejava
 * @since 2022-12-12 10:18:34
 */
@Service("moDataService")
public class MoDataServiceImpl extends ServiceImpl<MoDataMapper, MoData> implements MoDataService {
    @Resource
    private MoDataMapper moDataDao;

}
