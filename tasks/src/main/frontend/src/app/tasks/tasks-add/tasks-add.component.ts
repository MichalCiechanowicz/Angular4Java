import {Component, OnInit} from '@angular/core';
import {TaskService} from "../task.service";
import {Task} from "../task.model";
import {getLocaleDateFormat} from "@angular/common";

@Component({
    selector: 'app-tasks-add',
    templateUrl: './tasks-add.component.html',
    styleUrls: ['./tasks-add.component.css']
})
export class TasksAddComponent implements OnInit {

    addTaskValue: string = null;

    constructor(private taskService: TaskService) {

    }

    ngOnInit(): void {
    }

    onTaskAdd($event) {

        let task: Task = new Task($event.target.value, false, getLocaleDateFormat("dd/mm/yy", 10));
        this.taskService.addTask(task).subscribe(
            (newTask: Task) => {
                //clear input
                this.addTaskValue = ' ';
                this.taskService.onTaskAdded.emit(newTask);
            }
        );

    }
}
