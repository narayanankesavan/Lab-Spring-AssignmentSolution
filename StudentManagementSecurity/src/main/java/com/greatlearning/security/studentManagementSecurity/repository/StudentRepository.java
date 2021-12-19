package com.greatlearning.security.studentManagementSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.security.studentManagementSecurity.entity.Student;

public interface StudentRepository extends JpaRepository <Student,Integer> {


}
