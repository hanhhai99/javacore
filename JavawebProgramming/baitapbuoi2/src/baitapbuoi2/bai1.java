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
public class bai1 {
    public static void main(String[] args) {
                Scanner h = new Scanner(System.in);
                    float a = h.nextFloat();
                    float b = h.nextFloat();
                    float c = h.nextFloat();
                if (a==0) {
                    if (b==0) {
                        if (c==0) {
                            System.out.print("phuong rinh luon dung");
                        }
                        else {
                            System.out.print("phuong trinh vo nghiem");
                        }
                    }
                    else {
                        float x = -c/b;
                        System.out.printf("phuong trinh co 1 nghiem x = %f", x);
                        }
                }  
                else {
                    float delta = b*b-4*a*c;
                        if (delta<0) {
                            System.out.print("phuong trnh vo nghiem");
                        }
                        else if (delta==0){
                           float x = -b/2*a;
                           System.out.printf("phuong trinh co nghiep kep x = %f", x);
                        }
                        else {
                            System.out.printf("phuong trinh co 2 nghiem x1= %f va x2 = %f", (-b-Math.sqrt(delta))/2*a, (-b+Math.sqrt(delta))/2*a );
                        }
                }
                
        // TODO code application logic here
    }
    
}
