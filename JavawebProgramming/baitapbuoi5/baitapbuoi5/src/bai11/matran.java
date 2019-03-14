/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class matran {
    private int hang;
    private int cot;
    private int [][] values;
    
    public matran() {
        
    }
    
    public matran( int [][] values, int hang, int cot) {
        this.hang = 2;
        this.cot = 2;
        this.values = new int [2][2];
        
    }

    public int getHang() {
        return hang;
    }

    public int getCot() {
        return cot;
    }

    public int[][] getValues() {
        return values;
    }

    public void setHang(int hang) {
        this.hang = hang;
    }

    public void setCot(int cot) {
        this.cot = cot;
    }

    public void setValues(int[][] values) {
        this.values = values;
    }
    
    public void print(){
        int [][] a = new int [2][2];
        System.out.println("nhập vào các phần tử: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j]=sc.nextInt();  
            }
        }
    
          System.out.println("ma trận a là: ");
            for (int i =0; i<2; i++) {
                for (int j = 0; j < a.length; j++) {
                    System.out.print("  " + a[i][j] + " ");   
                }
                System.out.println("");
            
                
            }
            
        }
    
    
     public static void main(String[] args){
         matran mt = new matran();
         mt.print();
         
        
     }
}
