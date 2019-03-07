/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi5.bai1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class nhanvien {
    private String name;
    private int age;
    private String add;
    private double salary;
    private int time;
    
public nhanvien() {
    
}

public nhanvien(String name, int age, String add, double salary, int time) {
    this.name = name;
    this.age = age;
    this.add = add;
    this.salary = salary;
    this.time = time;
}

public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAdd() {
        return add;
    }
    public void setAdd(String add) {
        this.add= add;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
    
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên: ");
        name = sc.nextLine();
        System.out.println("nhập tuổi: ");
        age = sc.nextInt();
        System.out.println("nhập địa chỉ: ");
        add = sc.nextLine();
        System.out.println("nhập tiền lương: ");
        salary = sc.nextDouble();
        System.out.println("nhập số giờ làm: ");
        time = sc.nextInt();
    }
    
    public void printInfo() {
        System.out.println("nhập tên" +name);
        System.out.println("nhập tuổi" +age);
        System.out.println("nhập địa chỉ" +add);
        System.out.println("nhập lương" +salary);
        System.out.println("nhập số giờ làm" +time);
    }

    public double tinhThuong() {
        double thuong=0;
        if(time >= 200) { 
            thuong = salary*0.2;
        }
        if (time>=100 && time < 200) {
            thuong = salary*0.1;
        }
        if(time<100) {
            thuong=0;
        }
        System.out.println("tiền thưởng của nhân viên là: ");
        return thuong;
        
    }
    
    
}
 
   
