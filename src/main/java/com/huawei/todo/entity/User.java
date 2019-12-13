package com.huawei.todo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author sumutella
 * @time 11:20 PM
 * @since 12/12/2019, Thu
 */
@Getter
@Setter
@Entity
@Table(name = "users")
@SequenceGenerator(name = "entitySeq", sequenceName = "users_seq", allocationSize = 1)
public class User extends BaseEntity {
    private String email;
    private String username;
    private String password;
    private Boolean enabled;
    @Column(name = "full_name")
    private String fullName;
    private Long ssn;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    private ConfirmationToken confirmationToken;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    Set<Task> tasks = new HashSet<>();

}
