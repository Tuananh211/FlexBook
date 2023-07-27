package com.example.flexbookback.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "friends")
@NoArgsConstructor
@AllArgsConstructor
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "friend_id")
    private int friend_id;

    @ManyToOne
    @JoinColumn(name = "user_id1")
    private User user1;

    @ManyToOne
    @JoinColumn(name = "user_id2")
    private User user2;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private FriendStatus status;

    @ManyToOne
    @JoinColumn(name = "action_user_id")
    private User action_user;

    @Column(name = "created_at", nullable = false)
    private Timestamp created_at;

    @Column(name = "updated_at")
    private Timestamp updated_at;
}
