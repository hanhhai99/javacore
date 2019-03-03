/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai8 {

    /**
     * @param args the command line arguments
     */
    public static void nhap (int a[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào ma trận: ");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
    }
    
    public static void mtdv(int a[][]) {
        int kt =0;
        for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if((i==j && a[i][j] ==1) || (i!=j && a[i][j]==0) ) {
                        kt = 1;
                   }
                    else {
                        kt =0;
                        break;
                    }
                }    
            }
                if(kt==1) System.out.println("đây là ma trận đơn vị");
                else System.out.println("đây không phải là ma trận đơn vị");
    }
    public static void mtk ( int a[][]) {
        int kt=0;
        for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (i==j && a[i][j] == 0) {
                        kt=1;
                        break;
                    }
                    
                }
            }
                if(kt ==1){
                        System.out.println("đây là ma trận 0");
                    }
                    else {
                            System.out.println("đây không phải là ma trận 0");
                }
                
            }
    
    public static void mtdx (int a[][]) {
        int kt =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i][j] == a[i][j]) {
                    kt =1;
                }
             }
            
        }
        if(kt==1) {
            System.out.println("đây là ma trận đối xứng");
        }
        else {
            System.out.println("đây không phải là ma trận đối xứng");
        }
               
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] a = new int [3][3];
        nhap(a);
        mtdv(a);
        mtk(a);
        mtdx(a);
    }
    
}
