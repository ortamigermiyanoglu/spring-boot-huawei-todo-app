package com.huawei.todo.mapper;

import com.huawei.todo.dto.v1.UserDto;
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
    UserDto userToUserDto(User user);
    User userDtoToUser(UserDto userDto);
}
