import { Component, OnInit } from '@angular/core';
import { Task } from '../task.model';

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

    tasks: Task[] = [];

  constructor() { }

  ngOnInit(): void {

      this.tasks.push(new Task(1,"Task 1", true, "01/01/2021"))
      this.tasks.push(new Task(2,"Task 2", false, "01/11/2021"))
      this.tasks.push(new Task(3,"Task 3", false, "21/06/2021"))

  }
    getDueDateLabel(task:Task){
      return task.completed ? 'label-success' : 'label-primary';
    }

    onTaskChange(event, task) {
      console.log('Task has changed');

    }
}
