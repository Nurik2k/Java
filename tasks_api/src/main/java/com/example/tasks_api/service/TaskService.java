package com.example.tasks_api.service;

import com.example.tasks_api.entity.Task;
import com.example.tasks_api.enums.TaskStatus;
import com.example.tasks_api.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {
        task.setCreatedDate(LocalDateTime.now());
        return taskRepository.save(task);
    }


    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task updateTask(Long id, Task updatedTask) {
        return taskRepository.findById(id).map(task -> {
            task.setTitle(updatedTask.getTitle());
            task.setDescription(updatedTask.getDescription());
            task.setStatus(updatedTask.getStatus());
            if (updatedTask.getStatus() == TaskStatus.COMPLETED) {
                task.setCompletedDate(LocalDateTime.now());
            } else {
                task.setCompletedDate(null);
            }
            return taskRepository.save(task);
        }).orElseThrow(() -> new IllegalArgumentException("Task not found"));
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public List<Task> getTasksByStatus(TaskStatus status) {
        return taskRepository.findByStatus(status);
    }
}

