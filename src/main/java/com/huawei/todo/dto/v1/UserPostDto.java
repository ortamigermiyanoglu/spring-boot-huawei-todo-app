package com.huawei.todo.dto.v1;

import lombok.Getter;
import lombok.Setter;

/**
 * @author sumutella
 * @time 12:59 AM
 * @since 12/13/2019, Fri
 */
@Setter
@Getter
public class UserPostDto extends BaseEntityDto {
    private String username;
    private String password;
    private String fullName;
}
