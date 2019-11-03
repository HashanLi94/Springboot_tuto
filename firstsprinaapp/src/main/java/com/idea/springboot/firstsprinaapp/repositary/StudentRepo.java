package com.idea.springboot.firstsprinaapp.repositary;

import com.idea.springboot.firstsprinaapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
