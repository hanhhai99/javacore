/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class StudentManager {
    
    private String dir = "std.cat";
    private List<Student> list;
    
    public StudentManager() {
        this.list = new ArrayList<>();
    }
    
    public void add() {
        Scanner sc = new Scanner(System.in);
        Student std = new Student();
        System.out.println("nhap ten: ");
        std.setName(sc.nextLine());
        System.out.println("nhap roll: ");
        std.setRoll(sc.nextLine());
        System.out.println("nhap date");
        std.setDate(Integer.parseInt(sc.nextLine()));
        this.list.add(std);
    }
    
    public Student search(String name) {
        for(Student student : list) {
            if(student.getName() == name) {
                return student;
            }
        }
        return null;
    }
    
    public void delete(Student student){
        for (Student st : list) {
            if(st.equals(student)) list.remove(st);
        }
    }
    public boolean save()  {
        try {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dir));
        oos.writeObject(this.list);
        oos.flush();
        oos.close();
    }catch(Exception e) {
        e.printStackTrace();
        return false;
    
    }
        return false;
    }
    
    public void read(String file){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            List<Student> data = (List<Student>) ois.readObject();
            this.list = data;
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}
