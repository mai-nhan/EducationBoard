package com.ifisolution.repository;

import java.util.ArrayList;
import java.util.List;

import com.ifisolution.model.Student;

public class StudentRepositoryImpl implements StudentRepository{
	public List<Student> getAllStudent(){
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("Nhan", "Ha noi"));
		return list;
	}
}
