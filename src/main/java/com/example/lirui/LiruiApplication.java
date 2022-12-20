package com.example.lirui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan({"com.example.lirui.mapper"})
public class LiruiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiruiApplication.class, args);
    }
}
