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
public class main {
    public static void main(String[] args) {
        System.out.println("Nhập vào số lượng Nhân Viên");
        int n;
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        nhanvien array[] = new nhanvien[n];//new lần 1
        for (int i = 0; i < array.length; i++) {
           array[i] = new nhanvien();
           array[i].inputInfo();
        }
        for (int i = 0; i < array.length; i++) {
            nhanvien nhanVien = array[i];
            nhanVien.printInfo();
        }
    }
}
