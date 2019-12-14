package com.huawei.todo.repository;

import com.huawei.todo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @time 11:51 AM
 * @since 12/13/2019, Fri
 */
public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findByUser_Id(Integer id);
    void deleteById(Integer id);

}
