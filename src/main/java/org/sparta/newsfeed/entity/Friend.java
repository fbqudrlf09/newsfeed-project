package org.sparta.newsfeed.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.sparta.newsfeed.enums.FriendType;

@Getter

@Entity
@Table(name = "friend_tbl")
public class Friend {

    @OneToOne
    @JoinColumn(name = "user_id1")
    private User user;

    @OneToOne
    @JoinColumn(name = "user_id2")
    private User user;

    @Enumerated(EnumType.STRING)
    private FriendType state;
}
