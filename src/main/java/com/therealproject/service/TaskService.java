package com.therealproject.service;

import com.therealproject.domain.Task;

public interface TaskService {


    Iterable<Task> list();

    Task save(Task task);
}
