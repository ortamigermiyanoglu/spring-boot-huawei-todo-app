package com.huawei.todo.mapper;

import com.huawei.todo.dto.v1.TaskUnitDto;
import com.huawei.todo.entity.TaskUnit;
import org.mapstruct.Mapper;

/**
 * @time 10:14 AM
 * @since 12/13/2019, Fri
 */
@Mapper
public interface TaskUnitMapper {
    TaskUnitDto taskUnitToTaskUnitDto(TaskUnit taskUnit);
    TaskUnit taskUnitDtoToTaskUnit(TaskUnitDto taskUnitDto);
}
