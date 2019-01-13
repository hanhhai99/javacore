/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    
        private String masv;
        private double diemtb;
        private int tuoi;
        private String lop;
    
    public Student () {
        }
    
    public Student ( String masv, double diemtb, int tuoi, String lop) {
         this.masv = masv;
         this.diemtb = diemtb;
         this.tuoi = tuoi;
         this.lop = lop;
    }   
    
    public String getMasv () {
        return masv;
    }
    public void setMasv(String manv){
        this.masv = masv;
    }
    public double getDiemtb() {
        return diemtb;
    }
    public void setDiemtb(double diemtb) {
        this.diemtb = diemtb;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public String getLop(){
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
            System.out.print("nhap ma sinh vien: ");
            masv = sc.nextLine();
            System.out.print("nhap diem trung binh: ");
            diemtb = sc.nextDouble();
            System.out.print("nhap tuoi: ");
            tuoi = sc.nextInt();
            System.out.print("nhpa ten lop: ");
            lop = sc.nextLine();
    }
    
    public void showInfo() {
        System.out.print("ma sinh vien la: " +masv);
        System.out.print("tuoi: "+tuoi);
        System.out.print("diem trung binh: " +diemtb);
        System.out.print("lop" +lop);
    }
    
    public void hongbong() {
        if (diemtb > 8.0) {
            System.out.print("sinh vien duoc hoc bong");
         
        }
        else {
            System.out.print("sinh vien khong duoc hoc bong");
        }
    }
    }
    

