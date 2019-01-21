/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so n");
            int n = sc.nextInt();
            int count =0;
        while(n>0) {
            int temp = n%10;
            n = n/10;
            count++;
        System.out.println("gia tri la");
        if(count == 1){
            System.out.println("la hang don vi ");
        }
        if(count == 2){
            System.out.println("la hang chuc ");
        }
        if(count == 3){
            System.out.println("la hang tram ");
        }
        System.out.println("gia tri la " +temp);
        }
    }
    
}
