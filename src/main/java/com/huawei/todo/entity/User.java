package com.huawei.todo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sumutella
 * @time 11:20 PM
 * @since 12/12/2019, Thu
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "users")
@SequenceGenerator(name = "entitySeq", sequenceName = "users_seq", allocationSize = 1)
public class User extends BaseEntity {
    private String username;
    private String password;
    @Column(name = "full_name")
    private String fullName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    private List<Task> tasks = new ArrayList<>();


}
