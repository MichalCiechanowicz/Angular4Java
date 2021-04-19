package com.poweremabox.tasks;

import com.poweremabox.tasks.domain.Task;
import com.poweremabox.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}

	@Bean
	CommandLineRunner runner (TaskService taskService){
		return args -> {
		taskService.addTask(new Task(1L,"Zjedz kielbase", LocalDate.now(),false));
		taskService.addTask(new Task(2L,"Zjedz maslo", LocalDate.now(),true));
		taskService.addTask(new Task(3L,"Zjedz bulke", LocalDate.now(),false));
		taskService.addTask(new Task(4L,"Zjedz talerz", LocalDate.now(),true));
		};
	}

}
