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
public class bai8 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("nhap x: ");
                int x = sc.nextInt();
            System.out.print("nhap n: ");
                int n = sc.nextInt();
                int i;
                float sinx = 0;
            for (i=0;i<n;i++) {
                sinx += (float)((Math.pow(-1,i))*((Math.pow(x,( 2*i+1))/(2*i+1))));
            }
         System.out.printf("sinx la %f", sinx);
    }
    
}
