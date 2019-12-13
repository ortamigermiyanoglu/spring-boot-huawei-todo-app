package com.huawei.todo.mapper;

import com.huawei.todo.dto.UserPostDto;
import com.huawei.todo.entity.User;
import org.mapstruct.Mapper;

/**
 * @author sumutella
 * @time 10:07 AM
 * @since 12/13/2019, Fri
 */
@Mapper
public interface UserMapper  {
    UserPostDto userToUserPostDto(User user);
    User userPostDtoToUser(UserPostDto userPostDto);
}
