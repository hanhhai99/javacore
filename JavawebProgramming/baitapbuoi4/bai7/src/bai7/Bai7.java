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
    public static void Nhap (int a[][]){
        Scanner sc = new Scanner(System.in);
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = sc.nextInt();
                    
                }
            
        }
    }
    public static void In (int a[][]) {
        for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    System.out.print(" " +a[i][j]+ " ");
                }
                System.out.println("");
                }
    }
    public static void tong (int a[][], int b[][]) {
        int [][] c = new int [3][3];
        for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                     c[i][j] = a[i][j] + b[i][j];
                      System.out.print(" " +c[i][j]+ " ");
                }
               System.out.println("");
                }
    }
    public static void tich (int a[][], int b[][]) {
        int [][] c = new int [3][3];
        for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                     c[i][j] += a[i][j] * b[i][j];
                     System.out.print(" " +c[i][j]+ " ");
                }
                System.out.println("");
                }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] a= new int [3][3];
        System.out.println("nhap vao ma tran a: ");
        Nhap(a);
        int [][] b= new int [3][3];
        System.out.println("nhap ma tran b: ");
        Nhap(b);
        System.out.println("tong cua 2 ma tran:");
        tong(a,b);
        System.out.println("tich cua 2 ma tran: ");
        tich(a,b);
    }
    
}
