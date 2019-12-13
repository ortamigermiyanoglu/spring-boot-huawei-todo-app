package com.huawei.todo.controller;

import com.huawei.todo.dto.TaskUnitPostDto;
import com.huawei.todo.entity.TaskUnit;
import com.huawei.todo.service.TaskUnitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author sumutella
 * @time 5:18 PM
 * @since 12/13/2019, Fri
 */
@RestController
@RequestMapping("/api/taskunits")
public class TaskUnitController {
    private final TaskUnitService taskUnitService;

    public TaskUnitController(TaskUnitService taskUnitService) {
        this.taskUnitService = taskUnitService;
    }

    @GetMapping({"/{taskId}"})
    public ResponseEntity<List<TaskUnitPostDto>> getTaskUnits(@PathVariable Integer taskId){
        return new ResponseEntity<>(taskUnitService.getAllTaskUnits(taskId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TaskUnitPostDto> createNewTaskUnit(@RequestBody TaskUnitPostDto taskUnitPostDto){
        return new ResponseEntity<>(taskUnitService.save(taskUnitPostDto), HttpStatus.OK);
    }


}
