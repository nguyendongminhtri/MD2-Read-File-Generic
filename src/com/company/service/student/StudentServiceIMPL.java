package com.company.service.student;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.Student;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class StudentServiceIMPL implements IStudentService {
    public static String PATH = "E:\\CODEGYM\\C0222I1\\ReadFileBinaryMultipleGeneric\\src\\com\\company\\data\\student.txt";
    public static List<Student> studentList = new ConfigReadAndWriteFile<Student>().readFromFile(PATH);

    @Override
    public List<Student> findAll() throws IOException {
        new ConfigReadAndWriteFile<Student>().writeToFile(PATH, studentList);
        return studentList;
    }

    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public Student findById(int id) {
        return null;
    }
}
