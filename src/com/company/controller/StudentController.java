package com.company.controller;

import com.company.model.Student;
import com.company.service.student.StudentServiceIMPL;

import java.io.IOException;
import java.util.List;

public class StudentController {
    StudentServiceIMPL studentServiceIMPL = new StudentServiceIMPL();
    public List<Student> showListStudent() throws IOException {
        return studentServiceIMPL.findAll();
    }
    public void createStudent(Student student){
        studentServiceIMPL.save(student);
    }
}
