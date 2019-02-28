/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2c;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai2c {

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
        
        for( int i=0; i<5; i++) {
            if(a[i]%3==0) {
                System.out.printf("%d ",a[i]);
            }
        }
        
    }
    
}
