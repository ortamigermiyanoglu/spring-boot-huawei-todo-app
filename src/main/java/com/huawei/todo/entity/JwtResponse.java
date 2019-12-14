package com.huawei.todo.entity;

import java.io.Serializable;

/**
 * @time 12:15 PM
 * @since 12/14/2019, Sat
 */
public class JwtResponse implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;

    private final String jwttoken;

    public JwtResponse(String jwttoken) {

        this.jwttoken = jwttoken;

    }

    public String getToken() {

        return this.jwttoken;

    }

}