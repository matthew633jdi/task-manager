package com.dailyseed.task_manager.task;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Task extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @Builder
    public Task(String title, String content, TaskStatus status) {
        this.title = title;
        this.content = content;
        this.status = status != null ? status : TaskStatus.TODO;
    }
}
