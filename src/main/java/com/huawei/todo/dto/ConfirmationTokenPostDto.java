package com.huawei.todo.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author sumutella
 * @time 1:04 AM
 * @since 12/13/2019, Fri
 */
@Setter
@Getter
public class ConfirmationTokenPostDto extends BaseEntityDto {
    private String confirmationToken;
    private UserPostDto user;
}
