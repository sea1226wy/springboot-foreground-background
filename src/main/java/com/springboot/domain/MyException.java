package com.springboot.domain;

/**
 * @auther Seay
 * @date 2019/4/19 9:29
 * 自定义异常类
 */
public class MyException extends RuntimeException{
    private String code;
    private String msg;

    public MyException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}