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
public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap x: ");
            int x = sc.nextInt();
        System.out.print("nhap n: ");
            int n = sc.nextInt();
            int i;
            float cosx = 0;
        for(i=1; i<=n; i++) {
            cosx += (float)((Math.pow(-1,i+1))*((Math.pow(x,(2*i))/(2*i))));
        }
      System.out.printf("cosx la %f", cosx);
    }
}
