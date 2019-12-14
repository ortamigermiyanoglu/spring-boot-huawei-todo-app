package com.huawei.todo.dto.v1;

import lombok.Getter;
import lombok.Setter;

/**
 * @author sumutella
 * @time 11:45 AM
 * @since 12/13/2019, Fri
 */
@Setter
@Getter
public class UserGetDto extends BaseEntityDto {
    private String username;
    private String fullName;
}
