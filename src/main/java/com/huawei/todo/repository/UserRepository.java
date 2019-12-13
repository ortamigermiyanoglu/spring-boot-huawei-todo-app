package com.huawei.todo.repository;

import com.huawei.todo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author sumutella
 * @time 12:19 AM
 * @since 12/13/2019, Fri
 */
@RepositoryRestResource(path = "users")
public interface UserRepository extends JpaRepository<User, Integer> {
}
