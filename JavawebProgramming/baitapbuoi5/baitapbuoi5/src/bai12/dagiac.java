/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class dagiac {
    int canhb1;
    int canhb2;
    int canhd1;
    int  canhd2;
    
    public dagiac(){
        
    }
    
    public dagiac(int canhb1, int canhb2, int canhd1, int canhd2) {
        this.canhb1 = canhb1;
        this.canhb2 = canhb2;
        this.canhd1 = canhd1;
        this.canhd2 = canhd2;
    }

    public int getCanhb1() {
        return canhb1;
    }

    public int getCanhb2() {
        return canhb2;
    }

    public int getCanhd1() {
        return canhd1;
    }

    public int getCanhd2() {
        return canhd2;
    }

    public void setCanhb1(int canhb1) {
        this.canhb1 = canhb1;
    }

    public void setCanhb2(int canhb2) {
        this.canhb2 = canhb2;
    }

    public void setCanhd1(int canhd1) {
        this.canhd1 = canhd1;
    }

    public void setCanhd2(int canhd2) {
        this.canhd2 = canhd2;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ dài cạnh bên 1: ");
        canhb1 = sc.nextInt();
        System.out.println("nhập độ dài cạnh bên 2: ");
        canhb2 = sc.nextInt();
        System.out.println("nhập độ dài cạnh bên 1: ");
        canhd1 = sc.nextInt();
        System.out.println("nhập độ dài cạnh bên 2: ");
        canhd2 = sc.nextInt();
    }
    
    public void print() {
        System.out.println("Cạnh bên 1 là: " +canhb1);
        System.out.println("Cạnh bên 2 là: " +canhb2);
        System.out.println("Cạnh đáy 1 là: " +canhd1);
        System.out.println("Cạnh đáy 2 là: " +canhd2);
    }

    void chuvi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void dientich() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
