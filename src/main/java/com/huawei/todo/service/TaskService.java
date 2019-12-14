package com.huawei.todo.service;

import com.huawei.todo.dto.v1.TaskDto;

import java.util.List;

/**
 * @time 11:08 AM
 * @since 12/13/2019, Fri
 */
public interface TaskService {
    TaskDto save(TaskDto taskDto);
    void delete(Integer id);
    List<TaskDto> getAllTasks();
}
