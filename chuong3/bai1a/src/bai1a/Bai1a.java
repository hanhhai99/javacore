/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1a;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int[] h = new int[5];
            int tong = 0;
            int i;
        System.out.print("nhap vao cac phan tu mang: ");
        Scanner sc = new Scanner(System.in);
            
            for (i=0; i<5; i++) {
                 h[i] = sc.nextInt();
                tong += h[i];
            }
        System.out.print("in ra cac phan tu mang: ");
            for(i=0;i<5;i++) {
               System.out.println("tong la " +h[i]);
            }
        System.out.println("tong la " +tong);
    }
    
}
