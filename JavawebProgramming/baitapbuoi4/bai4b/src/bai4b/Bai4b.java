/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4b;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a = new int [15];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao cac phan tu mang: ");
        int i;
        for(i = 0; i< a.length; i++) {
            a[i] = sc.nextInt();
        }
        int temp = a[0];
        for(i=0; i< a.length-1; i++) {
            for(int j =i+1; j< a.length; j++) {
                if(a[i] < a[j]) {
                temp = a[j] ;
                a[j] = a[i];
                a[i] = temp;
                
            }
            }
        }
        System.out.println("day giam dan la: ");
        for ( i =0; i< a.length; i++) {
            System.out.println("" +a[i]);
        }
                
    }
    
}