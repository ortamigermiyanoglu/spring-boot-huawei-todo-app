package com.huawei.todo.controller.v1;

import com.huawei.todo.dto.v1.UserDto;
import com.huawei.todo.exception.ValidationException;
import com.huawei.todo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @time 2:02 PM
 * @since 12/13/2019, Fri
 */
@RestController
@RequestMapping("/api/v1/users/")
public class UserRestController {
    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }


    @PostMapping("save")
    public UserDto createNewCustomer(@RequestBody UserDto userDto){
        String username = userDto.getUsername();
        if (userService.existsByUsername(username)){
            throw new ValidationException("Username already exists");
        }

        String password = userDto.getPassword();
        String encodedPassword = new BCryptPasswordEncoder().encode(password);
        String fullName = userDto.getFullName();

        UserDto userDto1 = new UserDto();
        userDto1.setUsername(username);
        userDto1.setPassword(encodedPassword);
        userDto1.setFullName(fullName);
        return userService.save(userDto1);
    }

}
