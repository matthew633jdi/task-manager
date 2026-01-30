package com.dailyseed.task_manager.task;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TaskStatus {
    TODO("할 일"),
    IN_PROGRESS("진행 중"),
    DONE("취소"),
    CANCELED("취소");

    private final String description;

    public boolean canTransitionTo(TaskStatus nextStatus) {
        if (this == DONE || this == CANCELED) {
            return false;
        }

        return true;
    }
}
