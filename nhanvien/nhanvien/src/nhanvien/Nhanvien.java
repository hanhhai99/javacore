/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Nhanvien {
   
        private String ten;
        private int tuoi;
        private String diachi;
        private double luong;
        private int sogio;
    
    public Nhanvien () {
        
    }
   

    public Nhanvien (String ten, int tuoi, String diachi, double luong, int sogio) {
            this.ten = ten;
            this.tuoi = tuoi;
            this.diachi = diachi;
            this.luong = luong;
            this.sogio = sogio;
}
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi (int tuoi) {
        this.tuoi = tuoi;
    }
    public String getdiachi() {
        return diachi;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public double getLuong() {
        return luong;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    public int getSogio () {
        return sogio;
    }
    public void setSogio () {
        this.sogio = sogio;
    }
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
            System.out.println("nhap ten nhan vien: ");
            ten = sc.nextLine();
            System.out.print("nhap tuoi: ");
            tuoi = sc.nextInt();
            System.out.print("nhap dia chi: ");
            diachi = sc.nextLine();
            System.out.print("nhap tien luong: ");
            luong = sc.nextDouble();
            System.out.print("hap so gio lam: ");
            sogio = sc.nextInt();
    }
    
    public void printInfo() {
        System.out.print("ten nhan vien: " +ten);
        System.out.print("tuoi: " +tuoi);
        System.out.print("dia chi: " +diachi);
        System.out.print("tien luong: " +luong);
        System.out.print("tong so gio lam: " +sogio);
    }
    
    public  double tinhThuong() {
        double thuong;
        if ( sogio >= 200) {
            thuong = luong*0.2;
        }
        else if (sogio < 200 && sogio > 100) {
            thuong = luong*0.1;
        }
        else {
            thuong = 0;
        }
        return thuong;
        
    }
}

    


