package com.greatlearning.security.studentManagementSecurity.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.security.studentManagementSecurity.entity.Student;
@Service
public interface StudentService {
	
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student theBook);

	public void deleteById(int theId);

	

}
