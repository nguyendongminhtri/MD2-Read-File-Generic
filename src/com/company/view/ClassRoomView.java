package com.company.view;

import com.company.controller.ClassRoomController;
import com.company.model.ClassRoom;
import com.company.service.classroom.ClassRoomServiceIMPL;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ClassRoomView {
    Scanner scanner = new Scanner(System.in);
    List<ClassRoom> classRoomList = ClassRoomServiceIMPL.classRoomList;
    ClassRoomController classRoomController = new ClassRoomController();
    public void formCreateClassRoomView() throws IOException {
        while (true){
            int id;
            if(classRoomList.size()==0){
                id = 1;
            } else {
                id = classRoomList.get(classRoomList.size()-1).getId() +1;
            }
            System.out.println("Enter the name Class Room: ");
            String name = scanner.nextLine();
            ClassRoom classRoom = new ClassRoom(id,name);
            classRoomController.createClassRoom(classRoom);
            System.out.println("Enter any key to continue create Class Room or Enter QUIT comeback to MENU");
            String backMenu = scanner.nextLine();
            if(backMenu.equalsIgnoreCase("quit")){
                new Main();
            }
        }
    }
    public  void showListClassRoom() throws IOException {
        System.out.println(classRoomController.showListClassRoom());
        System.out.println("Enter QUIT comeback to MENU");
        String backMenu = scanner.nextLine();
        if(backMenu.equalsIgnoreCase("quit")){
            new Main();
        }
    }
}
