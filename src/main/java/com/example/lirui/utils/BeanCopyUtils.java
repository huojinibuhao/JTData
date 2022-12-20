package com.example.lirui.utils;

import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: SGBlog
 * @description: 拷贝的共通方法
 * @author: rli
 * @create: 2022-10-23 22:59
 **/

public class BeanCopyUtils {

    private BeanCopyUtils() {
    }

    // 前面一个V说明是泛型方法，后面一个V说明返回值类型是V
    public static <V> V copyBean(Object source, Class<V> clazz) {
        // 创建目标对象
        V result = null;
        try {
            result = clazz.newInstance();
            // 实现属性copy
            BeanUtils.copyProperties(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
        // 返回结果
        return result;

    }

    public static <O, V> List<V> copyBeanList(List<O> list, Class<V> clazz) {
        return list.stream().map(o -> copyBean(o, clazz)).collect(Collectors.toList());

    }
}