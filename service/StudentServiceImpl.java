package com.SpringbootProject.StudentManagement.service;

import com.SpringbootProject.StudentManagement.dao.StudentRepository;
import com.SpringbootProject.StudentManagement.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllstudents() {
        return studentRepository.findAll();
    }

}
