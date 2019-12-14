package com.huawei.todo.mapper.v1;

import com.huawei.todo.dto.v1.TaskDto;
import com.huawei.todo.entity.Task;
import org.mapstruct.Mapper;

/**
 * @time 10:10 AM
 * @since 12/13/2019, Fri
 */

@Mapper
public interface TaskMapper {
    TaskDto taskToTaskDto(Task task);
    Task taskDtoToTask(TaskDto taskDto);
}
