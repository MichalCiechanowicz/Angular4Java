package com.poweremabox.tasks.controler;


import com.poweremabox.tasks.domain.Task;
import com.poweremabox.tasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TasksControler {

    private TaskService taskService;

    @Autowired
    public TasksControler(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Task> listTasks() {
        return this.taskService.listTasks();
    }

    @PostMapping("/save")
    public Task addTask(@RequestBody Task task) {
       return this.taskService.addTask(task);
    }

}
