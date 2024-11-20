package com.luv2code.springboot.thymeleafdemo.dao;

import com.luv2code.springboot.thymeleafdemo.entity.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MembersRepository extends JpaRepository<Members,String> {
    @Query(value = "SELECT employee_id FROM members WHERE username = :username", nativeQuery = true)
    Integer findEmployeeIdByUsernameNative(@Param("username") String username);
}
