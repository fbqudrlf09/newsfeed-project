package org.sparta.newsfeed.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "comment")
@Getter
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "tinytext")
    private String comment;

    @Column
    private Long likes;

    // 양방향 연관관계
    // 게시판 하나에 여러 댓글을 사용 가능
//    @ManyToOne
//    @JoinColumn("board_id")
//    private Board board;

    // 양방향 연관관계
    // 댓글 하나에 여러 좋아요 사용
    @OneToMany
    @JoinColumn(name = "commentlike_id")
    private List<CommentLike> commentLikeList;

}
