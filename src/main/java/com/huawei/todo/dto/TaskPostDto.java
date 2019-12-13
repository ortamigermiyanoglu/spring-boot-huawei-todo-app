package com.huawei.todo.dto;

import com.huawei.todo.entity.TaskUnit;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sumutella
 * @time 1:00 AM
 * @since 12/13/2019, Fri
 */
@Setter
@Getter
public class TaskPostDto extends BaseEntityDto {
    private String name;
    private UserPostDto user;

    Set<TaskUnit> taskUnits = new HashSet<>();
}
