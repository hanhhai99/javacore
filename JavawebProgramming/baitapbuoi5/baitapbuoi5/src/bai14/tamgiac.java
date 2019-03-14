/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class tamgiac {
    int canh;
    int goc;
    
    public tamgiac() {
        
    }
    
    public tamgiac(int canh, int goc) {
        this.canh = canh;
        this.goc = goc;
    }

    public int getCanh() {
        return canh;
    }

    public int getGoc() {
        return goc;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    public void setGoc(int goc) {
        this.goc = goc;
    }
    
   public void input() {
       Scanner sc = new Scanner(System.in);
       System.out.println("nhập cạnh 1: ");
       canh = sc.nextInt();
       System.out.println("nhập cạnh 2: ");
       canh = sc.nextInt();
       System.out.println("nhập cạnh 3: ");
       canh = sc.nextInt();
       System.out.println("nhập góc 1: ");
       goc = sc.nextInt();
       System.out.println("nhập góc 2: ");
       goc = sc.nextInt();
       System.out.println("nhập góc 3: ");
       goc = sc.nextInt();
     
   }
   
   public void print() {
        System.out.println("cạnh 1 là");
        System.out.println("cạnh 2 là");
        System.out.println("cạnh 3 là");
        System.out.println("góc 1 là");
         System.out.println("góc 2 là");
          System.out.println("góc 3 là");
   }
   
    public static void main(String[] args) {
        tamgiac t = new tamgiac();
        t.input();
        t.print();
    }
}
