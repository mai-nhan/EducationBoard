package com.ifisolution.service;

import java.util.List;

import com.ifisolution.model.Student;
import com.ifisolution.repository.StudentRepository;
import com.ifisolution.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentServices {
	private StudentRepository studentRepository;
	
	
	public StudentRepository getStudentRepository() {
		return studentRepository;
	}


	public void setStudentRepository(StudentRepository studentRepositoryImpl) {
		this.studentRepository = studentRepositoryImpl;
	}


	public List<Student> getAllStudent(){
		return studentRepository.getAllStudent();
	}
}
