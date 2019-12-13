package com.huawei.todo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author sumutella
 * @time 11:23 PM
 * @since 12/12/2019, Thu
 */
@Data
@Setter
@Getter
@Entity
@Table(name = "task_units")
@SequenceGenerator(name = "entitySeq", sequenceName = "task_units_seq", allocationSize = 1)
public class TaskUnit extends BaseEntity {
    private String name;
    private String description;
    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date taskUnitCreationDate;
    private Date deadline;
    private String status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "task_id")
    private Task task;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pre_task_unit_id")
    private TaskUnit parentTaskUnit;


    @OneToOne(mappedBy = "parentTaskUnit")
    private TaskUnit subTaskUnit;


}
