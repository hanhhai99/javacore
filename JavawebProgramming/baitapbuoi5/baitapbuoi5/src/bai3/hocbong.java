/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class hocbong {
    private float diem;
    private boolean noiquy;
    private boolean hv;
    private boolean test;
    
    
public hocbong() {
    
}

public hocbong(float diem, boolean noiquy, boolean hv, boolean test ) {
    this.diem = diem;
    this.hv = hv;
    this.test = test;
    this.noiquy= noiquy;
}

public float getDiem() {
    return diem;
}
public void setDiem(float diem) {
    this.diem = diem;
}

public boolean getHv() {
    return hv;
}
public void setHv(boolean hv) {
    this.hv = hv;
}
public boolean getTest() {
    return test;
}
public void setTest(boolean test) {
    this.test = test;
}
public boolean getNoiquy() {
    return noiquy;
}
public void setNoiquy(boolean noiquy) {
    this.noiquy = noiquy;
}

public void inputInfo() {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("nhập điểm: ");
    diem = sc.nextFloat();
    
    System.out.println("có phải là học viên không? (1/0): ");
    int hv = sc.nextInt();
    this.hv = hv == 1 ? true : false;
    
    System.out.println("có vi phạm nội quy hay không? (1/0)");
    int noiquy = sc.nextInt();
    this.noiquy = noiquy == 1 ? true : false;
    
    System.out.println("có không bị nợ môn nào không? (1/0)");
    int test = sc.nextInt();
    this.test = test == 1 ? true : false;
    
}

public void printInfo() {
    if(hv==true) System.out.println("đây là học viên đã đăng kí khóa học ở HDSE");
    else System.out.println("đây không phải là học viên đã đăng kí khóa học ở HDSE");
    
    if(noiquy == true) System.out.println("học viên này có vi phạm nội quy");
    else System.out.println("học viên này không vi phạm nội quy");
    
    if(test == true) System.out.println("học viên này có bị nợ môn");
    else System.out.println(" học viên này không bị nợ môn nào ");
}

public void kiemtra() {
    if(hv == true && noiquy == false && test == false && diem>=75){
        System.out.println("học viên này có nhận được học bổng");
    }
    else {
        System.out.println("học viên này không nhận được học bổng");
}
}
}
