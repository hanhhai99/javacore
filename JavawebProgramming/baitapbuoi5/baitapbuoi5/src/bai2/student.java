/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class student {
    private String masv;
    private float diem;
    private int tuoi;
    private String lop;
    
public  student() {
    
}

public student(String masv,float diem,int tuoi, String lop ) {
    this.masv = masv;
    this.diem= diem;
    this.tuoi=tuoi;
    this.lop=lop;
}

    public String getMasv () {
        return masv;
    }
    public void setMasv(String manv){
        this.masv = masv;
    }
    
    public double getDiem () {
        return diem;
    }
    public void setDiem(float diem){
        this.diem = diem;
    }
    
    public int getTuoi () {
        return tuoi;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    
    public String getLop () {
        return lop;
    }
    public void setLop(String lop){
        this.lop = lop;
    }
    
public void inputInfo() {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhập mã sinh viên: ");
    masv = sc.nextLine();
    System.out.println("nhập tuổi: ");
    tuoi = sc.nextInt();
    System.out.println("nhập điểm trung bình: ");
    diem = sc.nextFloat();
    System.out.println("nhập lớp: ");
    lop = sc.nextLine();
}

public void printInfo() {
    System.out.println("mã sinh viên là: " +masv);
    System.out.println("tuổi = " +tuoi);
    System.out.println("điểm trung bình = "+diem);
    System.out.println("tên lớp: " +lop);
   
    }

public void hocbong() {
    if(diem>=8.0) {
        System.out.println("sinh viên được học bổng");
}
    else {
        System.out.println("sinh viên không được học bổng");
}
}

}