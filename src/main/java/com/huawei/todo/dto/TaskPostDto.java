package com.huawei.todo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author sumutella
 * @time 1:00 AM
 * @since 12/13/2019, Fri
 */
@Setter
@Getter
@NoArgsConstructor
public class TaskPostDto extends BaseEntityDto {
    private String name;
    private UserGetDto user;
}
