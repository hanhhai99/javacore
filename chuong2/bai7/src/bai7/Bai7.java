/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int i;
         int f0=1, f1=1, fn=0;
         if (n==1||n==0) {
             System.out.print("fibo la 1");
        }
         else {
             for(i=2;i<=n;i++) {
                 fn = f1 +f0;
                 f0 = f1;
                 f1 = fn;
             }
        System.out.printf("%d", fn);
    }
    }
}
