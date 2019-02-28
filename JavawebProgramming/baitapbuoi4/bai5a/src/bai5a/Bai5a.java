/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5a;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai5a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matrix = new int [3][3];
        
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j< matrix.length; j++) {
            System.out.println("nhap vao cac phan tu mang: ");
            matrix [i][j]=sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j< matrix.length; j++) {
                
            }
            }
    }
    
}
