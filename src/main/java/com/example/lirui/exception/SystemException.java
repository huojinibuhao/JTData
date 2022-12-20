package com.example.lirui.exception;

import com.example.lirui.enums.AppHttpCodeEnum;

/**
 * @program: SGBlog
 * @description: 统一的异常处理类
 * @author: rli
 * @create: 2022-10-29 19:56
 **/

public class SystemException extends RuntimeException {

    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public SystemException(AppHttpCodeEnum httpCodeEnum) {
        super(httpCodeEnum.getMsg());
        this.code = httpCodeEnum.getCode();
        this.msg = httpCodeEnum.getMsg();
    }

}
