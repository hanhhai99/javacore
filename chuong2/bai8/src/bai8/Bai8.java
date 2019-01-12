/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
