/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacvd;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CacVD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = 1;
        int i;
        
        
        for( i=1;i<n ;i++) {
        if(n==1) S=1;
        else if (n==2) S=5;
          else  S+=4*i;
                    
        }
        System.out.println("dien tich la" +S);
        
         
        }
        
      
        
    }
    

