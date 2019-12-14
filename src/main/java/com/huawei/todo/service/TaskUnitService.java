package com.huawei.todo.service;

import com.huawei.todo.dto.v1.TaskUnitDto;

import java.util.List;

/**
 * @time 11:14 AM
 * @since 12/13/2019, Fri
 */
public interface TaskUnitService {
    TaskUnitDto save(TaskUnitDto taskUnitDto);
    void delete(Integer taskUnitId);
    List<TaskUnitDto> getAllTaskUnits(Integer taskId);
}
