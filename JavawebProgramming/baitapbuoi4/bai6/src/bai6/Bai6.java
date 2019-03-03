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
        int [][] a = new int [3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ma tran: ");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = sc.nextInt();
            }
        }
        System.out.println("ma tran vua nhap la: ");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    System.out.print(" " +a[i][j]+ " ");   
                }
            System.out.println("");
        }
        int tonghang =0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    tonghang += a[i][j];    
            }
                System.out.println("tong hang thu " +(i+1)+ " la " +tonghang);
                    tonghang =0;
            }
        System.out.println("=========");
        
        int tongcot = 0;
            for (int j = 0; j < a.length; j++) {
                for (int i = 0; i < a.length; i++) {
                    tongcot += a[i][j];
            }
                System.out.println("tong cot thu " +(j+1)+ " la " +tongcot);
                    tongcot =0;
        }
    }
    
}
