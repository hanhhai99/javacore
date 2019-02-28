/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songuyento;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                
                    System.out.print("nhap vao so n: ");
                    int n = sc.nextInt();
                    int S = 0;
                    for(int i=0;i<n;i=+2) {
                        S += i;
                      System.out.println("tong S la" +S);           
                    }
                            
      
            
    }
}
                
                    
  
