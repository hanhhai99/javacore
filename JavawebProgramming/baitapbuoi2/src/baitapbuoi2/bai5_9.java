/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi2;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class bai5_9 {
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                int i;
                int tong = 0;
                int n = sc.nextInt();
            for(i=1;i<=n;i++) {
                tong += pow(x, i);
            }
          System.out.printf("tong la %d", tong);
        }
}
