package com.luv2code.springboot.thymeleafdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "employeeId",nullable = false)
    private int employeeId;

    @Column(name = "task")
    private String task;

    public Tasks() {
    }

    public Tasks(int employeeId) {
        this.employeeId = employeeId;
    }

    public Tasks(int employeeId, String task) {
        this.employeeId = employeeId;
        this.task = task;
    }
    public Tasks(int id,int employeeId,String task){
        this.id=id;
        this.employeeId=employeeId;
        this.task=task;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", task='" + task + '\'' +
                '}';
    }
}
