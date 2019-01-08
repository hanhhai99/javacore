/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i;
            int tong = 0;
        for (i=1; i <=n; i++) {
            tong+= Math.pow(i, 2);
        }
    System.out.printf("tong la %d", tong);
    }
    
}
