package com.huawei.todo.service;

import com.huawei.todo.dto.v1.TaskUnitPostDto;
import com.huawei.todo.entity.TaskUnit;
import com.huawei.todo.mapper.TaskUnitMapper;
import com.huawei.todo.repository.TaskUnitRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @time 5:44 PM
 * @since 12/13/2019, Fri
 */
@Service
public class TaskUnitServiceImpl implements TaskUnitService {

    private final TaskUnitRepository taskUnitRepository;
    private final TaskUnitMapper taskUnitMapper = Mappers.getMapper(TaskUnitMapper.class);

    public TaskUnitServiceImpl(TaskUnitRepository taskUnitRepository) {
        this.taskUnitRepository = taskUnitRepository;
    }


    @Transactional
    @Override
    public TaskUnitPostDto save(TaskUnitPostDto taskUnitPostDto) {
        TaskUnit savedTaskUnit = taskUnitRepository.save(taskUnitMapper.taskUnitPostDtoToTaskUnit(taskUnitPostDto));
        return taskUnitMapper.taskUnitToTaskUnitPostDto(savedTaskUnit);
    }

    @Transactional
    @Override
    public void delete(Integer taskUnitId) {
        taskUnitRepository.deleteById(taskUnitId);
    }

    @Transactional
    @Override
    public List<TaskUnitPostDto> getAllTaskUnits(Integer taskId) {
        List<TaskUnit> taskUnits = taskUnitRepository.findByTask_Id(taskId);
        return taskUnits.stream().map(taskUnitMapper::taskUnitToTaskUnitPostDto).collect(Collectors.toList());
    }
}
