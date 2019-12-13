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
    void delete(Integer id);
    List<TaskPostDto> getAllTasks();
}
