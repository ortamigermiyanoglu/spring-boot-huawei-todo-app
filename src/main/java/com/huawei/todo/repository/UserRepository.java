package com.huawei.todo.repository;

import com.huawei.todo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


/**
 * @time 12:19 AM
 * @since 12/13/2019, Fri
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
    Boolean existsByUsername(String username);

}
