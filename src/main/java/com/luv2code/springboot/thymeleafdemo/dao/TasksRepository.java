package com.luv2code.springboot.thymeleafdemo.dao;

import com.luv2code.springboot.thymeleafdemo.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TasksRepository extends JpaRepository<Tasks,Integer> {
    public List<Tasks> findAllByOrderById();
    public List<Tasks> findByEmployeeId(int employeeId);


}
