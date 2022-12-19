package com.example.restfullwithh2.service;

import com.example.restfullwithh2.entity.Student;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface StudentService {

    List<Student> getAllStudents();

    Student getStudent(int id);

    Student saveStudent(Student student);

    void deleteStudent(int id);
}
