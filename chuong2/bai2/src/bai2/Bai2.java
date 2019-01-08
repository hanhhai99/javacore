/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner h = new Scanner(System.in);
                    int n = h.nextInt();
                    long giaiThua = 1;
                    for (int i=1; i <=n; i++) {
                        giaiThua*=i;
                    }
                  System.out.printf("giai thua la %d", giaiThua);
    }
    
}
