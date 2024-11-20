package org.sparta.newsfeed.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "commentlike")
@Getter
public class CommentLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private Member member;

    @OneToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;
}
