/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner h = new Scanner(System.in);
            int a = h.nextInt();
            int b = h.nextInt();
         if ( a<b) {
             System.out.println("a la so nho, b la so lon");
         }
         else {
             System.out
                     .println("a la so lon, b la so nho");
         }
    }
    
}
