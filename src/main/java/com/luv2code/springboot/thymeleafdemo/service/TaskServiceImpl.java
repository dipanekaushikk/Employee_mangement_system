package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.dao.TasksRepository;
import com.luv2code.springboot.thymeleafdemo.entity.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService{
    private TasksRepository tasksRepository;
    @Autowired
    public TaskServiceImpl(TasksRepository tasksRepository1){
        tasksRepository=tasksRepository1;
    }

    @Override
    public List<Tasks> findAll() {
        return tasksRepository.findAll();
    }

    @Override
    public Tasks findById(int theId) {
         Optional<Tasks> result=tasksRepository.findById(theId);
         Tasks task=null;
         if(result.isPresent()){
             task=result.get();
         }
         else throw new RuntimeException("Did not find employee id-"+theId);
         return task;
    }

    @Override
    public void save(Tasks tasks) {
        tasksRepository.save(tasks);
    }

    @Override
    public void delete(int theId) {
        tasksRepository.deleteById(theId);

    }

    @Override
    public List<Tasks> findAllByEmployeeId(int theId) {
        return tasksRepository.findByEmployeeId(theId);

    }




}
