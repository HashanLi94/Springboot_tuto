package com.idea.springboot.firstsprinaapp.service;

import com.idea.springboot.firstsprinaapp.model.Student;
import com.idea.springboot.firstsprinaapp.repositary.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getAllStudents(){
        System.out.println(studentRepo.findAll().get(1));
        return studentRepo.findAll();

    }
    public Student addStudent(Student student){
        return studentRepo.save(student);
    }


}
