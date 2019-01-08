/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner h = new Scanner(System.in);
                int n = h.nextInt();
                
            if (n%2==0) {
                System.out.print("la so chan");
            }
            else {
                System.out.print("la so le");
            }
    }
    
}
