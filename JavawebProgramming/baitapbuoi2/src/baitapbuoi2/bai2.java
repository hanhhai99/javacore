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
public class bai2 {
    public static void main(String[] args) {
               Scanner h = new Scanner(System.in);
                    int n = h.nextInt();
                    long giaiThua = 1;
                    for (int i=1; i <=n; i++) {
                        giaiThua*=i;
                    }
                  System.out.printf("giai thua la %d", giaiThua);
           }
    
}
