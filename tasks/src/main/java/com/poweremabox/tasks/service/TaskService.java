package com.poweremabox.tasks.service;

import com.poweremabox.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> listTasks();

    Task addTask (Task task);

}
