package com.huawei.todo.controller.v1;

import com.huawei.todo.dto.v1.TaskUnitPostDto;
import com.huawei.todo.service.TaskUnitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @time 5:18 PM
 * @since 12/13/2019, Fri
 */
@RestController
@RequestMapping("/api/taskunits")
public class TaskUnitRestController {
    private final TaskUnitService taskUnitService;

    public TaskUnitRestController(TaskUnitService taskUnitService) {
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
