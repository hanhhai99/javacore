
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class bai2 {
     public static void main(String[] args) {
               Scanner h = new Scanner(System.in);
                    Scanner sc = new Scanner(System.in);
                        float a = sc.nextFloat();
                        float b = sc.nextFloat();
                        float c = sc.nextFloat();
                  if (a==0) {
                      if(b==c){
                          System.out.print("phuong trinh luon dung");
                      }
                      else {
                          System.out.print("phuong trinh vo nghiem");
                      }
                  }
                  else {
                      if (b==c){
                          System.out.print("phuong trinh co vo so nghiem");
                      }
                      else {
                          float x=(c-b)/a;
                          System.out.printf("phuong trinh co 1 nghiem x = %f", x);
                      }
                  }
        // TODO code application logic here
    }
    
    
}
