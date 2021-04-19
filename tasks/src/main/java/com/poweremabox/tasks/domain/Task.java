package com.poweremabox.tasks.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Task {

    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate date;
    private Boolean completed;

    public Task() {
    }

    public Task(Long id, String name, LocalDate date, Boolean completed) {
        Id = id;
        this.name = name;
        this.date = date;
        this.completed = completed;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return Objects.equals(getId(), task.getId()) && Objects.equals(getName(), task.getName()) && Objects.equals(getDate(), task.getDate()) && Objects.equals(getCompleted(), task.getCompleted());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDate(), getCompleted());
    }
}
