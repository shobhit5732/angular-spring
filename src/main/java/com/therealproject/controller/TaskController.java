package com.therealproject.controller;

import com.therealproject.domain.Task;
import com.therealproject.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {


    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
//below redircts to either local host 8080 or 8080/
    @GetMapping(value = {"", "/"})
    public Iterable<Task> listTrack() {
        return this.taskService.list();
    }


    @PostMapping("/save")

    public Task saveTask(@RequestBody Task task){
       return this.taskService.save(task);
    }
}
