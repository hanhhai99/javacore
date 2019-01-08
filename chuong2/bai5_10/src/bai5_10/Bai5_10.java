/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_10;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai5_10 {

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
                int tong = 0;
                int i;
            for(i=1; i<=n; i++) {
                tong += Math.pow(x, 2*i);
            }
        System.out.println("tong la: " +tong);
    }
    
}
