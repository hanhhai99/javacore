/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] h = new int [5];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
            int a = sc.nextInt();
            System.out.println("nhap vao cac phan tu mang: ");
        for(int i =0; i<5;i++) {
            
            h[i] = sc.nextInt();
            
        }
        for(int i =0; i<5;i++) {
            if(a==h[i]) {
                System.out.println("co xuat hien");
            }
            else {
                System.out.println("khong xuat hien");
            }
        }
    }
    
}
