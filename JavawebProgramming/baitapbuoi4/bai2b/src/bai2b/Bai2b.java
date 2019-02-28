/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2b;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a = new int [5];
        System.out.println("nhap vao cac phan tu mang: ");
        Scanner sc = new Scanner(System.in);
        for( int i=0; i<5; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for( int i=0; i<5; i++) {
            if(min>a[i]) {
                min=a[i];
            }
        }
        System.out.println("min = " +min);
    }
    
}
