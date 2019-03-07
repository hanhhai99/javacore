/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class hcn {
    private float dai;
    private float rong;
    
public hcn() {
    
}

public hcn(float dai, float rong) {
    this.dai= dai;
    this.rong=rong;
}

public float getDai() {
    return dai;
}
public void setDai(float dai) {
    this.dai = dai;
}

public float getRong() {
    return rong;
}
public void getRong(float rong) {
    this.rong = rong;
}

public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhập chiều dài: ");
    dai = sc.nextFloat();
    System.out.println("nhập chiều rộng: ");
    rong = sc.nextFloat();
}

public void print() {
    System.out.println("chiều dài = " +dai);
    System.out.println("chiều rộng = " +rong);
}

public void chuvi() {
    System.out.println("chu vi hình chữ nhật là: " +((dai+rong)*2));
}

public void dientich() {
    System.out.println("diện tích hình chữ nhật là: " +(dai*rong));
}

public static void main(String[] args) {
    hcn h = new hcn();
    h.input();
    h.print();
    h.chuvi();
    h.dientich();
}
}
