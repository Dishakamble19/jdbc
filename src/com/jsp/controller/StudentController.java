package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(4);
		student.setName("DISHA");
		student.setEmail("dishakamble19@gmail.com");
		student.setGender("Female");
		student.setPhoneno(985826846);
		
		StudentDao studentdao = new StudentDao();
		studentdao.savestudent(student);
		
		System.out.println("All good");
		
	}

}
