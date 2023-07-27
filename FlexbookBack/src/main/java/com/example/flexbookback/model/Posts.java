package com.example.flexbookback.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "posts")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private int post_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @Column(name = "post_image")
    private String post_image;

    @Column(name = "created_at", nullable = false)
    private Timestamp created_at;

    @Column(name = "updated_at")
    private Timestamp updated_at;

    @OneToMany(mappedBy = "post")
    private List<Likes> likes;

    @OneToMany(mappedBy = "post")
    private List<Comments> comments;


}
