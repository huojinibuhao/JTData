package com.example.lirui.enums;

/**
 * @author daizhengkang
 * @create 2021-09-08 17:19
 * @desc 返回结果吗
 */
public enum ResultCode {
    /* 成功状态码 */
    SUCCESS(10000, "成功"),

    /* 系统500错误*/
    SYSTEM_ERROR(10020, "系统异常，请稍后重试");
    /* 参数错误：10001-19999 */

    private Integer status;

    private String msg;

    ResultCode(Integer code, String message) {
        this.status = code;
        this.msg = message;
    }

    public Integer code() {
        return this.status;
    }

    public String message() {
        return this.msg;
    }
}
