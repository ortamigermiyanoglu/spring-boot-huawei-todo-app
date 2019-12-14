package com.huawei.todo.service;

import com.huawei.todo.dto.v1.UserGetDto;
import com.huawei.todo.dto.v1.UserPostDto;
import com.huawei.todo.entity.User;
import com.huawei.todo.mapper.UserMapper;
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
    public List<UserGetDto> getAllUsers() {
        return userRepository.findAll().stream().map(userMapper::userToUserGetDto).collect(Collectors.toList());
    }
}
