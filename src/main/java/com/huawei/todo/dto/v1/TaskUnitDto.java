package com.huawei.todo.dto.v1;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @time 1:00 AM
 * @since 12/13/2019, Fri
 */
@Setter
@Getter
public class TaskUnitDto extends BaseEntityDto {
    private String name;
    private String description;
    private Date deadline;
    private String status;

    private TaskDto task;


}
