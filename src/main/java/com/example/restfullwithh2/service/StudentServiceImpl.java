package com.example.restfullwithh2.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.restfullwithh2.dao.StudentDAO;
import com.example.restfullwithh2.entity.Student;
import java.util.List;
import java.beans.Transient;

@Service
public class StudentServiceImpl implements StudentService {

    @Qualifier("studentDAO")
    @Autowired
    private StudentDAO studentDao;

    @Override
    @Transactional
    public List<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    @Override
    public Student getStudent(int id) {
        return studentDao.getStudent(id);
    }

    @Override
    @Transactional
    public Student saveStudent(Student student){
        return studentDao.saveStudent(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }



}
