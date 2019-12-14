package com.huawei.todo.service;

import com.huawei.todo.dto.v1.TaskPostDto;
import com.huawei.todo.entity.Task;
import com.huawei.todo.mapper.TaskMapper;
import com.huawei.todo.repository.TaskRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sumutella
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
    public TaskPostDto save(TaskPostDto taskPostDto) {
        Task savedTask = taskRepository.save(taskMapper.taskPostDtoToTask(taskPostDto));
        return taskMapper.taskToTaskPostDto(savedTask);
    }


    @Transactional
    @Override
    public void delete(Integer id) {
        taskRepository.deleteById(id);
    }

    @Override
    public List<TaskPostDto> getAllTasks() {
        return taskRepository.findAll().stream().map(taskMapper::taskToTaskPostDto).collect(Collectors.toList());
    }
}
