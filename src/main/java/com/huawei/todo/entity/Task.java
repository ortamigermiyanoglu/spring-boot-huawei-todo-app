package com.huawei.todo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author sumutella
 * @time 11:23 PM
 * @since 12/12/2019, Thu
 */
@Setter
@Getter
@Entity
@Table(name = "tasks")
@SequenceGenerator(name = "entitySeq", sequenceName = "tasks_seq", allocationSize = 1)
public class Task extends BaseEntity {
    @Column(name = "task_name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "task")
    Set<TaskUnit> taskUnits = new HashSet<>();


}
