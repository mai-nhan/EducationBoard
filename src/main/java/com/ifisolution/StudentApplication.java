package com.ifisolution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ifisolution.service.StudentServices;

public class StudentApplication {
	public static void main(String[] args) {
		/*StudentServices studentService = new StudentServiceImpl();
		List<Student> list = studentService.getAllStudent();
		System.out.println(list.size());
		System.out.println(list.get(0));*/
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		StudentServices service = context.getBean("studentService",StudentServices.class);
		// = (StudentServices) context.getBean("studentService");
		System.out.println(service.getAllStudent().size());
	}
}
