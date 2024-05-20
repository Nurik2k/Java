package com.example.tasks_api.repository;

import com.example.tasks_api.entity.Task;
import com.example.tasks_api.enums.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
}
