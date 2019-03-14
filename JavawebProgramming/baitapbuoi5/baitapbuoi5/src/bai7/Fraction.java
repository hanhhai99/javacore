/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Fraction {
    private int tu;
    private int mau;
    
public Fraction() {
    
}

public Fraction(int tu, int mau) {
    this.tu = tu;
    this.mau=mau;
}

public int getTu() {
    return tu;
}
public void setTu(int tu) {
    this.tu = tu;
}

public int getMau() {
    return mau;
}
public void setMau(int mau) {
    this.mau = mau;
}

public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhập tử số: ");
    tu = sc.nextInt();
    System.out.println("nhập mẫu số: ");
    mau = sc.nextInt();
}

public void print() {
    
    System.out.println("phân số là: " +tu+"/"+mau);
}

public int UCLN() {
    int m= tu;
    int n = mau;
    while (m!=n) {
        if(m>n) {
            m=m-n;
        }
        else {
            n=n-m;
        }
       
    }
        return m;
}
           
public void rutGon(){
    int u = UCLN();
    if(tu%mau==0) {
        System.out.println("phân số rút gọn là: " +tu/mau);
    }
    else {
        System.out.println("phân số rút gọn là: " +(tu/u)+"/"+(mau/u));
    }
            
}

public void Ngich() {
    int u = UCLN();
    int a = tu/mau;
    if(tu%mau==0) {
    System.out.println("phân số nghịch đảo là:  1/" +tu/mau);
}
    else {
        System.out.println("phân số nghịch đảo là: " +(mau/u)+"/"+(tu/u));
}
}

public Fraction add(Fraction fr) {
    Fraction add = new Fraction();
        add.tu = this.tu*fr.getMau() + this.mau*fr.getTu();
        add.mau = this.mau*fr.getMau();
    return add;
}

public Fraction sub(Fraction fr) {
    Fraction sub = new Fraction();
        sub.tu =  this.tu*fr.getMau() - this.mau*fr.getTu();
        sub.mau = this.mau*fr.getMau();
    return sub;
}

public Fraction mul(Fraction fr) { 
    Fraction mul = new Fraction();
        mul.tu = this.tu * fr.getTu();
        mul.mau = this.mau * fr.getMau();
    return mul;

}

public Fraction div(Fraction fr) {
    Fraction div = new Fraction();
        div.tu = this.tu * fr.getMau();
        div.mau = this.mau*fr.getTu();
    return div;
}

public static void main(String[] args) {
    Fraction fr = new Fraction();
    fr.input();
    fr.print();
    fr.UCLN();
    fr.rutGon();
    fr.Ngich();
    System.out.println("Nhập phân số thứ 2:");
        Fraction fr2 = new Fraction();
        fr2.input();
        
        Fraction add;
        add =fr.add(fr2);
        System.out.println("Tổng của 2 phân số là:");
        add.print();            
                    
        Fraction sub;
        sub = fr.sub(fr2);
        System.out.println("Hiệu của 2 phân số là:");
        sub.print();
        
        Fraction mul;
        mul = fr.mul(fr2);
        System.out.println("Tích của 2 phân số là:");
        mul.print();
        
        Fraction div;
        div = fr.div(fr2);
        System.out.println("Thương của 2 phân số là:");
        div.print();
    
}

   

   
}
