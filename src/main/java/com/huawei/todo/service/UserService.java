package com.huawei.todo.service;

import com.huawei.todo.dto.v1.UserDto;

import java.util.List;

/**
 * @time 11:05 AM
 * @since 12/13/2019, Fri
 */
public interface UserService {
    UserDto save(UserDto userDto);
    List<UserDto> getAllUsers();
    Boolean existsByUsername(String username);
}
