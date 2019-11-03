package com.idea.springboot.firstsprinaapp.control;

import com.idea.springboot.firstsprinaapp.model.Student;
import com.idea.springboot.firstsprinaapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/getAllStudent")
    public List<Student> getAllStudent(){
//        System.out.println(studentService.getAllStudents().get(1));
        return studentService.getAllStudents();

    }
    @PostMapping(value = "/saveStudent")
    public Student saveStudent(@RequestBody Student student){
        System.out.println(student);
        return studentService.addStudent(student);
    }



}
