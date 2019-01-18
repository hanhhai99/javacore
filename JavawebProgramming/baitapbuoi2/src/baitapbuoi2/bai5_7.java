/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class bai5_7 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("nhap n: ");
                int n = sc.nextInt();
                int i;
                float tong = 0;
            for(i=0;i<n;i++) {
                tong += (float)(2*i + 1)/(2*i + 2);
            }
            System.out.printf("tong la %f", tong);
                
            
    }
    
}
