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
public class bai5_1 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                float tong = 0;
                int i;
                for(i=1; i<=n;i++) {
                    tong +=1.0/i;
                }
             System.out.printf("tong la %f", tong);
            }
    
}
