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
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 2 so a, b");
            int a = sc.nextInt();
            int b = sc.nextInt();
        if(a<b) {
            System.out.println("a<b");
        }
        else 
            System.out.println("a>b");
    }
    
}
