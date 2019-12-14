package com.huawei.todo.exception;

/**
 * @author sumutella
 * @time 12:28 PM
 * @since 12/14/2019, Sat
 */
public class ValidationException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String msg;

    public ValidationException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}