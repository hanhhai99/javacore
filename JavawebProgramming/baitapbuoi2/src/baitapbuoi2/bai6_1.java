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
public class bai6_1 {
    public static void main(String[] args) {
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
