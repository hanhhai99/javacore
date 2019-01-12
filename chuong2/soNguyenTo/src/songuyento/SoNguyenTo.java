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
public class SoNguyenTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner sc = new Scanner(System.in);
                System.out.print("nhap n: ");
                int n = sc.nextInt();
            if (n<2) {
                System.out.print("khong phai la so nguyen to");
            }
            else {
                for(int i=2; i<= Math.sqrt(n); i++) {
                    if (n%i==0) {
                        System.out.print("khong phai la so nguyen to");
                    }
                    else {
                        System.out.print("la so nguyen to");
                    }
                }
            }
            
    }
  
}
