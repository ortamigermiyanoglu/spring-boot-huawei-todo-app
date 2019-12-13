package com.huawei.todo.controller;

import com.huawei.todo.dto.UserGetDto;
import com.huawei.todo.dto.UserPostDto;
import com.huawei.todo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author sumutella
 * @time 2:02 PM
 * @since 12/13/2019, Fri
 */
@RestController
@RequestMapping("/api/users")
public class UserRestController {
    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserGetDto>> getUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }


    @PostMapping
    public UserPostDto createNewCustomer(@RequestBody UserPostDto userPostDto){
        return userService.save(userPostDto);
    }

}
