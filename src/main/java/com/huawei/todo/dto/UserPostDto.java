package com.huawei.todo.dto;

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
    private String email;
    private String username;
    private String password;
    private Boolean enabled;
    private String fullName;
    private Long ssn;


}
