/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class triangle {
    private float a;
    private float b;
    private float c;
    
public triangle() {
    
}

public triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
}

public float getA() {
    return a;
}
public void setA(float a) {
    this.a = a;
}

public float getB() {
    return b;
}
public void setB(float b) {
    this.b = b;
}

public float getC() {
    return c;
}
public void setC(float c) {
    this.c = c;
}

public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("canh a");
    a = sc.nextFloat();
    System.out.println("canh b");
    b = sc.nextFloat();
    System.out.println("canh c");
    c = sc.nextFloat();
}

public void print() {
    System.out.println("độ dài cạnh a = " +a);
    System.out.println("độ dài cạnh b = " +b);
    System.out.println("độ dài cạnh c = " +c);
}

public void kieutamgiac() {
    
    if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2) || Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2) || Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2)) {
        System.out.println("đây là tam giác vuông");
    }
    else if(a==b || a==c || b==c){
        System.out.println("đây là tam giác cân");
    }
    else if (a==b && a==c && b==c) {
        System.out.println("đây là tam giác đều");
    }
    else {
        System.out.println("đây là tam giác thường");
    }
            
           
}

public void chuvi() {
   
    System.out.println("chu vi tam giác là" +(a+b+c));
}

public void dientich() {
    float p = (a+b+c)/2;
        System.out.println("Diện tích tam giác trên là "+ Math.sqrt(p*(p-a)*(p-b)*(p-c)));
}

public static void main(String[] args) {
    triangle h = new triangle();
    h.input();
    h.print();
    h.kieutamgiac();
    h.chuvi();
    h.dientich();
}
}
