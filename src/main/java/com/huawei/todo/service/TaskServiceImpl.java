package com.huawei.todo.service;

import com.huawei.todo.dto.v1.TaskDto;
import com.huawei.todo.entity.Task;
import com.huawei.todo.mapper.v1.TaskMapper;
import com.huawei.todo.repository.TaskRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @time 5:43 PM
 * @since 12/13/2019, Fri
 */
@Service
public class TaskServiceImpl implements TaskService {

    private final TaskMapper taskMapper = Mappers.getMapper(TaskMapper.class);

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Transactional
    @Override
    public TaskDto save(TaskDto taskDto) {
        Task savedTask = taskRepository.save(taskMapper.taskDtoToTask(taskDto));
        return taskMapper.taskToTaskDto(savedTask);
    }


    @Transactional
    @Override
    public void delete(Integer id) {
        taskRepository.deleteById(id);
    }

    @Override
    public List<TaskDto> getAllTasks() {
        return taskRepository.findAll().stream().map(taskMapper::taskToTaskDto).collect(Collectors.toList());
    }
}
