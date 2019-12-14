package com.huawei.todo.mapper;

import com.huawei.todo.dto.v1.TaskUnitPostDto;
import com.huawei.todo.entity.TaskUnit;
import org.mapstruct.Mapper;

/**
 * @author sumutella
 * @time 10:14 AM
 * @since 12/13/2019, Fri
 */
@Mapper
public interface TaskUnitMapper {
    TaskUnitPostDto taskUnitToTaskUnitPostDto(TaskUnit taskUnit);
    TaskUnit taskUnitPostDtoToTaskUnit(TaskUnitPostDto taskUnitPostDto);
}
