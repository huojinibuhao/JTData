package com.example.lirui.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
public class MybatisMetaObjectHandler implements MetaObjectHandler {
    /**
     * 插入元对象字段填充（用于插入时对公共字段的填充）
     *
     * @param metaObject 元对象
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        Object crtDate = getFieldValByName("createDate", metaObject);
        if (crtDate == null) {
            setFieldValByName("createDate", LocalDateTime.now(), metaObject);
        }
        Object updDate = getFieldValByName("updateDate", metaObject);
        if (updDate == null) {
            setFieldValByName("updateDate", LocalDateTime.now(), metaObject);
        }
    }

    /**
     * 更新元对象字段填充（用于更新时对公共字段的填充）
     *
     * @param metaObject 元对象
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        Object updDate = getFieldValByName("updateDate", metaObject);
        if (updDate == null) {
            setFieldValByName("updateDate", LocalDateTime.now(), metaObject);
        }
    }


}
