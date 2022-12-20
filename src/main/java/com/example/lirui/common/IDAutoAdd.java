package com.example.lirui.common;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName IDAutoAdd
 * @Description TODO
 * @Author lr
 * @Date 2022/12/12 15:54
 * @Version 1.0
 */
public class IDAutoAdd {
    private static AtomicInteger aLong = new AtomicInteger();
    public static Integer getId(){
        Integer andIncrement = aLong.getAndIncrement();
        return andIncrement;
    }
}
