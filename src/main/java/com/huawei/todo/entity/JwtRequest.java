package com.huawei.todo.entity;

import java.io.Serializable;

/**
 * @author sumutella
 * @time 6:26 PM
 * @since 12/14/2019, Sat
 */
public class JwtRequest implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;

    private String username;

    private String password;

    public JwtRequest()

    {

    }

    public JwtRequest(String username, String password) {

        this.setUsername(username);

        this.setPassword(password);

    }

    public String getUsername() {

        return this.username;

    }

    public void setUsername(String username) {

        this.username = username;

    }

    public String getPassword() {

        return this.password;

    }

    public void setPassword(String password) {

        this.password = password;

    }

}