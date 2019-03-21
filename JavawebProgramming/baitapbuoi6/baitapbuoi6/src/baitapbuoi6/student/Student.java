/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi6.student;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Student {
    private String name;
    private String email;
    private int age;
    
    public Student() {
        
    }
    
    public Student(String name, String email, int age) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên: ");
        name = sc.nextLine();
        System.out.println("nhập email: ");
        email = sc.nextLine();
        System.out.println("nhập tuổi: ");
        age = sc.nextInt();
        
    }
    
    public void print() {
        System.out.println("tên là: " +name);
        System.out.println("email là: " +email);
        System.out.println("tuổi = " +age);
    }
    
    
    
}
