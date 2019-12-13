package com.huawei.todo.service;

import com.huawei.todo.dto.TaskPostDto;
import com.huawei.todo.dto.UserGetDto;
import com.huawei.todo.dto.UserPostDto;
import com.huawei.todo.entity.Task;
import com.huawei.todo.entity.User;
import com.huawei.todo.mapper.TaskMapper;
import com.huawei.todo.mapper.UserMapper;
import com.huawei.todo.repository.TaskRepository;
import com.huawei.todo.repository.UserRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sumutella
 * @time 11:59 AM
 * @since 12/13/2019, Fri
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper = Mappers.getMapper(UserMapper.class);

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    @Override
    public UserPostDto save(UserPostDto userPostDto) {

        User savedUser = userRepository.save(userMapper.userPostDtoToUser(userPostDto));
        return userMapper.userToUserPostDto(savedUser);

    }

    @Transactional
    @Override
    public UserGetDto findByEmail(String email) {
        User user = userRepository.findByEmail(email).orElseGet(User::new);
        return userMapper.userToUserGetDto(user);

    }

    @Transactional
    @Override
    public List<UserGetDto> getAllUsers() {
        // ben normalde eski tarz lambda yazmistim intellij onerdi bu yolu
        return userRepository.findAll().stream().map(userMapper::userToUserGetDto).collect(Collectors.toList());
    }
}
