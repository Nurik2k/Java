package com.example.tasks_api.controller;

import com.example.tasks_api.entity.Task;
import com.example.tasks_api.enums.TaskStatus;
import com.example.tasks_api.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class TaskController {
    private static final Logger log = LoggerFactory.getLogger(TaskController.class);
    @Autowired
    private TaskService taskService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody Task task) {
        log.info("Creating task: {}", task);
        return taskService.createTask(task);
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        log.info("Getting task with id: {}", id);
        return taskService.getTaskById(id)
                .orElseThrow(() -> new IllegalArgumentException("Task not found"));
    }

    @GetMapping("/")
    public List<Task> getAllTasks() {
        log.info("Getting all tasks");
        return taskService.getAllTasks();
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        log.info("Updating task with id: {}", id);
        return taskService.updateTask(id, updatedTask);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTask(@PathVariable Long id) {
        log.info("Deleting task with id: {}", id);
        taskService.deleteTask(id);
    }

    @GetMapping(params = "status")
    public List<Task> getTasksByStatus(@RequestParam TaskStatus status) {
        log.info("Getting tasks with status: {}", status);
        return taskService.getTasksByStatus(status);
    }

}
