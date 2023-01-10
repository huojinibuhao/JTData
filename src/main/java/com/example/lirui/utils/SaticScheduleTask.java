package com.example.lirui.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * @ClassName SaticScheduleTask
 * @Description TODO
 * @Author lr
 * @Date 2023/1/10 16:39
 * @Version 1.0
 */
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class SaticScheduleTask {
    //3.添加定时任务
    @Scheduled(cron = "0/20 * * * * ?")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)
    private void configureTasks() {
        System.err.println("开始发起请求: " + LocalDateTime.now());
        HttpMyUtils.getReq("http://localhost:9999/externProperty/test1");
    }
}

