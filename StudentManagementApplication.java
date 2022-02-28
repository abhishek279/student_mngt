package com.SpringbootProject.StudentManagement;

import com.SpringbootProject.StudentManagement.dao.StudentRepository;
import com.SpringbootProject.StudentManagement.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;

@SpringBootApplication(exclude = SqlInitializationAutoConfiguration.class)
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

//		Student student1=new Student("Abhishek","Datta","ad@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2=new Student("Rohit","Bhamore","rb@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3=new Student("Prathammesh","Kallanke","pk@gmail.com");
//		studentRepository.save(student3);
	}

}