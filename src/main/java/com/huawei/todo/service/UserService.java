package com.huawei.todo.service;

import com.huawei.todo.dto.BaseEntityDto;
import com.huawei.todo.dto.TaskPostDto;
import com.huawei.todo.dto.UserGetDto;
import com.huawei.todo.dto.UserPostDto;
import com.huawei.todo.entity.User;

import java.util.List;
import java.util.Optional;

/**
 * @author sumutella
 * @time 11:05 AM
 * @since 12/13/2019, Fri
 */
public interface UserService {
    UserPostDto save(UserPostDto userPostDto);
    UserGetDto findByEmail(String email);
    List<UserGetDto> getAllUsers();
}
