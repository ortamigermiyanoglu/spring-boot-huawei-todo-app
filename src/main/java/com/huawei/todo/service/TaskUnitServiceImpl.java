package com.huawei.todo.service;

import com.huawei.todo.dto.v1.TaskUnitDto;
import com.huawei.todo.entity.TaskUnit;
import com.huawei.todo.mapper.v1.TaskUnitMapper;
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
    public TaskUnitDto save(TaskUnitDto taskUnitDto) {
        TaskUnit savedTaskUnit = taskUnitRepository.save(taskUnitMapper.taskUnitDtoToTaskUnit(taskUnitDto));
        return taskUnitMapper.taskUnitToTaskUnitDto(savedTaskUnit);
    }

    @Transactional
    @Override
    public void delete(Integer taskUnitId) {
        taskUnitRepository.deleteById(taskUnitId);
    }

    @Transactional
    @Override
    public List<TaskUnitDto> getAllTaskUnits(Integer taskId) {
        List<TaskUnit> taskUnits = taskUnitRepository.findByTask_Id(taskId);
        return taskUnits.stream().map(taskUnitMapper::taskUnitToTaskUnitDto).collect(Collectors.toList());
    }
}
