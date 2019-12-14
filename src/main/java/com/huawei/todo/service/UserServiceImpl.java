package com.huawei.todo.service;

import com.huawei.todo.dto.v1.UserDto;
import com.huawei.todo.entity.User;
import com.huawei.todo.mapper.v1.UserMapper;
import com.huawei.todo.repository.UserRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
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
    public UserDto save(UserDto userDto) {

        User savedUser = userRepository.save(userMapper.userDtoToUser(userDto));
        return userMapper.userToUserDto(savedUser);

    }

    @Transactional
    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream().map(userMapper::userToUserDto).collect(Collectors.toList());
    }

    @Override
    public Boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }
}
