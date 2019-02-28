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
        int [] a = new int [5];
        System.out.println("nhap vao cac phan tu mang: ");
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        for( int i=0; i<5; i++) {
            a[i] = sc.nextInt();
        }
        for( int i=0; i<5; i++) {
            tong += a[i];
        }
        System.out.println("tong = "+tong);
        
        
    }
    
}
