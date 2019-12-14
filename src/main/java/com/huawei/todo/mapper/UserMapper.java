package com.huawei.todo.mapper;

import com.huawei.todo.dto.v1.UserGetDto;
import com.huawei.todo.dto.v1.UserPostDto;
import com.huawei.todo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @time 10:07 AM
 * @since 12/13/2019, Fri
 */
@Mapper
public interface UserMapper  {
    @Mapping(target = "password", ignore = true)
    UserPostDto userToUserPostDto(User user);
    User userPostDtoToUser(UserPostDto userPostDto);
    UserGetDto userToUserGetDto(User user);
    User userGetDtoToUser(UserGetDto userGetDto);
}
