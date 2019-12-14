package com.huawei.todo.controller.v1;

import com.huawei.todo.dto.v1.TaskDto;
import com.huawei.todo.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @time 5:18 PM
 * @since 12/13/2019, Fri
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskRestController {
    private final TaskService taskService;

    public TaskRestController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<TaskDto>> getTasks(){
        return new ResponseEntity<>(taskService.getAllTasks(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TaskDto> createNewTask(@RequestBody TaskDto taskDto){
        return new ResponseEntity<>(taskService.save(taskDto), HttpStatus.OK);
    }

    @DeleteMapping({"/{id}"})
    public void deleteTask(@PathVariable Integer id){
        taskService.delete(id);
    }

}
