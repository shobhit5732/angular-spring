package com.therealproject.service;

import com.therealproject.domain.Task;
import com.therealproject.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {


    private TaskRepository taskRepository;


    public TaskServiceImpl(TaskRepository taskRepository) {

        this.taskRepository = taskRepository;
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }

    @Override
    public Iterable<Task> list() {

    return this.taskRepository.findAll();
    }



}
