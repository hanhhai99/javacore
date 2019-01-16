/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 3 so a, b , c: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float x;
        x = (float)((c-b)/a);
        System.out.println("gia tri cua x la: " +x);
    }
    
}
