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
         Scanner sc = new Scanner(System.in);
            System.out.println("nhap so a: ");
                int iSoa = sc.nextInt();
            System.out.println("nhap so b: ");
                int iSob = sc.nextInt();
            while (iSoa != iSob) {
        if (iSoa > iSob) {
            iSoa -= iSob;
        }
        else {
            iSob -= iSoa;
        }
    
    }
             System.out.printf("UCLN cua a va b la %d: ", iSoa, iSob);   
    }
    
}
