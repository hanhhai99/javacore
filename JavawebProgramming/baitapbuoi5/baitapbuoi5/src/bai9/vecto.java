/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class vecto {
    private int tung;
    private int hoanh;
    
    public vecto() {
        
    }
    
    public vecto(int tung, int hoanh) {
        this.tung = tung;
        this.hoanh=hoanh;
    }

    public int getTung() {
        return tung;
    }

    public int getHoanh() {
        return hoanh;
    }

    public void setTung(int tung) {
        this.tung = tung;
    }

    public void setHoanh(int hoanh) {
        this.hoanh = hoanh;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tung độ: " );
        tung = sc.nextInt();
        System.out.println("tung độ là: " +tung);
        System.out.print("nhập hoành độ: " );
        hoanh = sc.nextInt();
        System.out.println("hoành độ là: " +hoanh);
        System.out.println("");
         
    }
    
    public void print() {

      
        System.out.println("vecto 1 là: (" +tung+ ";" +hoanh+ ")");
      System.out.println("");
    }
    
    
    public vecto add(vecto vt) {
        vecto add = new vecto();
        add.tung = this.tung + vt.getTung();
        add.hoanh = this.hoanh + vt.getHoanh();
        return add;
        
    }
    
    public vecto sub(vecto vt){
        vecto sub = new vecto();
        sub.tung = this.tung - vt.getTung();
        sub.hoanh = this.hoanh - vt.getHoanh();
        return sub;
    }
    
    public int mul(vecto vt){
        int mul = 0;
       mul = this.hoanh*vt.hoanh + this.tung*vt.tung;
        return mul;
    }
    
   
    public static void main(String[] args) {
        vecto vt = new vecto();
        vt.input();
        vt.print();
        
        System.out.println("nhập vecto thứ 2 là : ");
        vecto vt2 = new vecto();
        vt2.input();
        
        vecto add;
        add = vt.add(vt2);
        System.out.println("tổng của 2 vecto là: ");
        add.print();
        
        vecto sub;
        sub = vt.sub(vt2);
        System.out.println("hiệu của 2 vecto là: ");
        sub.print();
        
//        vecto mul;
//        mul = vt.mul(vt2);
//        System.out.println("tích của 2 vecto là: ");
//        mul.print();
        
    }
}
