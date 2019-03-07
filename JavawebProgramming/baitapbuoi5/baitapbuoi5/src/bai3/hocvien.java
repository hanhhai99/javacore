/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class hocvien {
    private String name;
    private String mahv;
    private String lop;
    private String khoahoc;
    
public hocvien() {
    
}

public hocvien(String name, String mahv, String lop, String khoahoc) {
    this.name = name;
    this.mahv = mahv;
    this.lop = lop;
    this.khoahoc = khoahoc;
}

public String getName () {
    return name;
}
public void setName( String name) {
    this.name = name;
}

public String getLop() {
    return lop;
}
public void setLop(String lop) {
    this.lop = lop;
}

public String getMahv() {
    return mahv;
}
public void setMahv(String mahv) {
    this.mahv = mahv;
}

public String getKhoahoc() {
    return khoahoc;
}
public void setKhoahoc(String khoahoc) {
    this.khoahoc= khoahoc;
}

public void inputInfo() {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhập tên: ");
    name = sc.nextLine();
    System.out.println("nhập lớp: ");
    name = sc.nextLine();
    System.out.println("nhập mã học viên: ");
    name = sc.nextLine();
    System.out.println("nhập khóa học: ");
    name = sc.nextLine();
}

public void PrintInfo() {
    System.out.println("nhập tên: " +name);
    System.out.println("nhập lớp: " +lop);
    System.out.println("nhập mã học viên: " +mahv);
    System.out.println("nhập khóa học: " +khoahoc);
}


}
