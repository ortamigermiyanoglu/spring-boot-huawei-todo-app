package com.huawei.todo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sumutella
 * @time 11:23 PM
 * @since 12/12/2019, Thu
 */
@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "tasks")
@SequenceGenerator(name = "entitySeq", sequenceName = "tasks_seq", allocationSize = 1)
public class Task extends BaseEntity {
    @Column(name = "task_name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "task")
    private List<TaskUnit> taskUnits = new ArrayList<>();

}
