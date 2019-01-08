/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int i;
                float tong=0;
            for(i=1;i<=n;i++) {
                tong+= 1.0/(i*(i+1));
            }
        System.out.printf("tong la %f", tong);
    }
    
}
