package com.fedorenko.core;

import com.fedorenko.customer.object.Student;
import com.fedorenko.customer.object.WorkWithStudents;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main( String[] args ){

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		WorkWithStudents worker =
				(WorkWithStudents) context.getBean("worker");
//new WorkWithStudents();
		Student testStudent = new Student("Kate Fedorenko", 3);
		worker.saveStudentToDb(testStudent);
	}

}