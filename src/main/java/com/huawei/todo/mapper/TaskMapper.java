package com.huawei.todo.mapper;

import com.huawei.todo.dto.v1.TaskPostDto;
import com.huawei.todo.entity.Task;
import org.mapstruct.Mapper;

/**
 * @time 10:10 AM
 * @since 12/13/2019, Fri
 */

@Mapper
public interface TaskMapper {
    TaskPostDto taskToTaskPostDto(Task task);
    Task taskPostDtoToTask(TaskPostDto taskPostDto);
}
