package com.huawei.todo.service;

import com.huawei.todo.dto.v1.UserGetDto;
import com.huawei.todo.dto.v1.UserPostDto;

import java.util.List;

/**
 * @author sumutella
 * @time 11:05 AM
 * @since 12/13/2019, Fri
 */
public interface UserService {
    UserPostDto save(UserPostDto userPostDto);
    List<UserGetDto> getAllUsers();
}
