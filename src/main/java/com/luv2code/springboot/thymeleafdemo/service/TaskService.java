package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.Tasks;

import java.util.List;

public interface TaskService {
    List<Tasks> findAll();
    Tasks findById(int theId);
    void save(Tasks tasks);
    void delete(int theId);
    List<Tasks> findAllByEmployeeId(int theId);


}
