package com.huawei.todo.controller;

import com.huawei.todo.dto.TaskPostDto;
import com.huawei.todo.service.TaskService;
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
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<TaskPostDto>> getTasks(){
        return new ResponseEntity<>(taskService.getAllTasks(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TaskPostDto> createNewTask(@RequestBody TaskPostDto taskPostDto){
        return new ResponseEntity<>(taskService.save(taskPostDto), HttpStatus.OK);
    }

    @DeleteMapping({"/{id}"})
    public void deleteTask(@PathVariable Integer id){
        taskService.delete(id);
    }

}
