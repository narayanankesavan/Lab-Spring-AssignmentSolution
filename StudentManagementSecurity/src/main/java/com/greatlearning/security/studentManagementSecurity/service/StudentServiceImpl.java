package com.greatlearning.security.studentManagementSecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.security.studentManagementSecurity.entity.Student;
import com.greatlearning.security.studentManagementSecurity.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List <Student> books = studentRepository.findAll();
		return books;
	}

	@Override
	public Student findById(int theId) {
		// TODO Auto-generated method stub
		return studentRepository.getById(theId); 
	}

	@Override
	public void save(Student theBook) {
		// TODO Auto-generated method stub
		studentRepository.save(theBook);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(theId);
		
	}

	

	

}
