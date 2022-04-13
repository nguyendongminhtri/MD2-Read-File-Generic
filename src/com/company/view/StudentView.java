package com.company.view;

import com.company.controller.StudentController;
import com.company.model.ClassRoom;
import com.company.model.Student;
import com.company.service.classroom.ClassRoomServiceIMPL;
import com.company.service.student.StudentServiceIMPL;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    Scanner scanner = new Scanner(System.in);
    List<Student> studentList = StudentServiceIMPL.studentList;
    StudentController studentController = new StudentController();
    ClassRoomServiceIMPL classRoomServiceIMPL = new ClassRoomServiceIMPL();
    public void formCreateStudent() throws IOException {
        while (true){
            int id;
            if(studentList.size()==0){
                id = 1;
            } else {
                id = studentList.get(studentList.size()-1).getId() +1;
            }
            System.out.println("Enter the name Student: ");
            String name = scanner.nextLine();
            System.out.println("Enter the age Student: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter id Class Room: ");
            int idClass = Integer.parseInt(scanner.nextLine());
            ClassRoom classRoom = classRoomServiceIMPL.findById(idClass);
            Student student = new Student(id,name,age,classRoom);
            studentController.createStudent(student);
            System.out.println("Enter any key to continue create Class Room or Enter QUIT comeback to MENU");
            String backMenu = scanner.nextLine();
            if(backMenu.equalsIgnoreCase("quit")){
                new Main();
            }
        }
    }
    public  void showListStudent() throws IOException {
        System.out.println(studentController.showListStudent());
        System.out.println("Enter QUIT comeback to MENU");
        String backMenu = scanner.nextLine();
        if(backMenu.equalsIgnoreCase("quit")){
            new Main();
        }
    }
}
