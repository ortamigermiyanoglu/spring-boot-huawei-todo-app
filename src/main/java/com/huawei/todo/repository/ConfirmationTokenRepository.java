package com.huawei.todo.repository;

import com.huawei.todo.entity.ConfirmationToken;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sumutella
 * @time 11:53 AM
 * @since 12/13/2019, Fri
 */
public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, Integer> {
}
