package com.huawei.todo.service;

import com.huawei.todo.dto.TaskPostDto;
import com.huawei.todo.dto.TaskUnitPostDto;

import java.util.List;

/**
 * @author sumutella
 * @time 11:08 AM
 * @since 12/13/2019, Fri
 */
public interface TaskService {
    TaskPostDto save(TaskPostDto taskPostDto);
    List<TaskUnitPostDto> getAllTaskUnits(TaskPostDto taskPostDto);
    void delete(TaskPostDto taskPostDto);
}
