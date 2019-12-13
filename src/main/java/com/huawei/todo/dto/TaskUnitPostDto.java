package com.huawei.todo.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author sumutella
 * @time 1:00 AM
 * @since 12/13/2019, Fri
 */
@Setter
@Getter
public class TaskUnitPostDto extends BaseEntityDto {
    private String name;
    private String description;
    private Date deadline;
    private String status;

    private TaskPostDto task;


}
