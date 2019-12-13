package com.huawei.todo.mapper;

import com.huawei.todo.dto.ConfirmationTokenPostDto;
import com.huawei.todo.entity.ConfirmationToken;
import org.mapstruct.Mapper;

/**
 * @author sumutella
 * @time 10:24 AM
 * @since 12/13/2019, Fri
 */
@Mapper
public interface ConfirmationTokenMapper {
    ConfirmationTokenPostDto confirmationTokenToConfirmationTokenPostDto(ConfirmationToken confirmationToken);
    ConfirmationToken confirmationTokenPostDtoToConfirmationToken(ConfirmationTokenPostDto confirmationTokenPostDto);
}
