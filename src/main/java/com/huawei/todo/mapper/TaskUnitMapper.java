package com.huawei.todo.mapper;

import com.huawei.todo.dto.TaskPostDto;
import com.huawei.todo.dto.TaskUnitPostDto;
import com.huawei.todo.entity.Task;
import org.mapstruct.Mapper;

/**
 * @author sumutella
 * @time 10:14 AM
 * @since 12/13/2019, Fri
 */
@Mapper
public interface TaskUnitMapper {
    TaskUnitPostDto taskToTaskUnitPostDto(Task task);
    Task taskPostDtoToTask(TaskPostDto taskPostDto);
}
