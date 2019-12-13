package com.huawei.todo.service;

import com.huawei.todo.dto.TaskUnitPostDto;

import java.util.List;

/**
 * @author sumutella
 * @time 11:14 AM
 * @since 12/13/2019, Fri
 */
public interface TaskUnitService {
    TaskUnitPostDto save(TaskUnitPostDto taskUnitPostDto);
    void delete(Integer taskUnitId);
    List<TaskUnitPostDto> getAllTaskUnits(Integer taskId);
}
