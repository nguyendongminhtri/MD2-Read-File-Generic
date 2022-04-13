package com.company.service.classroom;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.ClassRoom;

import java.io.IOException;
import java.util.List;

public class ClassRoomServiceIMPL implements IClassRoomService {
    public static String PATH = "E:\\CODEGYM\\C0222I1\\ReadFileBinaryMultipleGeneric\\src\\com\\company\\data\\classroom.txt";
    public static List<ClassRoom> classRoomList = new ConfigReadAndWriteFile<ClassRoom>().readFromFile(PATH);

    @Override
    public List<ClassRoom> findAll() throws IOException {
        new ConfigReadAndWriteFile<ClassRoom>().writeToFile(PATH, classRoomList);
        return classRoomList;
    }

    @Override
    public void save(ClassRoom classRoom) throws IOException {
        classRoomList.add(classRoom);
        new ConfigReadAndWriteFile<ClassRoom>().writeToFile(PATH, classRoomList);
    }

    @Override
    public ClassRoom findById(int id) {
        for (int i = 0; i < classRoomList.size(); i++) {
            if (id == classRoomList.get(i).getId()) {
                return classRoomList.get(i);
            }
        }
        return null;
    }
}
