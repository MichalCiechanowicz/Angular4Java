package com.poweremabox.tasks.repository;


import com.poweremabox.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,Long> {

}
