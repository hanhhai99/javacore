/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
