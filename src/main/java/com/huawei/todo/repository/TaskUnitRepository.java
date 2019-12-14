package com.huawei.todo.repository;

import com.huawei.todo.entity.TaskUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @time 11:52 AM
 * @since 12/13/2019, Fri
 */
public interface TaskUnitRepository extends JpaRepository<TaskUnit, Integer> {
    List<TaskUnit> findByTask_Id(Integer id);
    List<TaskUnit> findByOrderByTaskUnitCreationDate();
    List<TaskUnit> findByOrderByDeadline();
    List<TaskUnit> findByOrderByName();
    List<TaskUnit> findByOrderByStatus();

    List<TaskUnit> findByStatusContainingIgnoreCase(String complete);
}
