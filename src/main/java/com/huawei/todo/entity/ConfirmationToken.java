package com.huawei.todo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author sumutella
 * @time 11:21 PM
 * @since 12/12/2019, Thu
 */
@Setter
@Getter
@Entity
@Table(name = "confirmation_token")
@SequenceGenerator(name = "entitySeq", sequenceName = "confirmation_token_seq", allocationSize = 1)
public class ConfirmationToken extends BaseEntity {
    @Column(name = "confirmation_token")
    private String confirmationToken;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date tokenCreationDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


}
