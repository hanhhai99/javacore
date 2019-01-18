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
public class bai5_11 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                    int x = sc.nextInt();
                    int i;
                    int n= sc.nextInt();
                    int tong =0;
                for (i=1;i<=n;i++) {
                    tong += Math.pow(x,2*i);
                }
             System.out.printf("tong la %d", tong);
        }
    
}
