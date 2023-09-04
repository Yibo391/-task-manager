package com.taskmanager.service;

import com.taskmanager.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    public List<Task> listTasks() {
        return tasks;
    }

    public Task createTask(Task task) {
        task.setId(nextId++);
        tasks.add(task);
        return task;
    }
}
