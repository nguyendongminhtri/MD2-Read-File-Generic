package com.company.config;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConfigReadAndWriteFile<T> {
    public List<T> readFromFile(String path){
        System.out.println("GOI HAM READ");
        List<T> tList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            System.out.println("check ==> "+fileInputStream.read());

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            tList = (List<T>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tList;
    }
    public void writeToFile(String path, List<T> tList) throws IOException{
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(tList);
            fileOutputStream.close();
            objectOutputStream.close();
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
