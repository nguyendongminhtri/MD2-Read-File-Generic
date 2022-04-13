package com.company.view;

import java.io.IOException;
import java.util.Scanner;

public class Main {
public Main() throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("==================STUDENT MANAGE ==========================");
    System.out.println("1. CREATE CLASS ROOM");
    System.out.println("2. SHOW LIST CLASS ROOM");
    System.out.println("3. CREATE STUDENT");
    System.out.println("4. SHOW LIST STUDENT");
    int chooseMenu = scanner.nextInt();
    switch (chooseMenu){
        case 1:
            new ClassRoomView().formCreateClassRoomView();
            break;
        case 2:
            new ClassRoomView().showListClassRoom();
            break;
        case 3:
            new StudentView().formCreateStudent();
            break;
        case 4:
            new StudentView().showListStudent();
            break;
    }
}
    public static void main(String[] args) throws IOException {
	// write your code here
        new Main();
    }
}
