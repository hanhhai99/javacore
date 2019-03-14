/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class soPhuc {
    private int thuc;
    private int ao;
    
public soPhuc() {
}

public soPhuc(int thuc, int ao) {
    this.thuc = thuc;
    this.ao = ao;
}

    public int getThuc() {
        return thuc;
    }

    public int getAo() {
        return ao;
    }

    public void setThuc(int thuc) {
        this.thuc = thuc;
    }

    public void setAo(int ao) {
        this.ao = ao;
    }

public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhập số thực: ");
    thuc = sc.nextInt();
    System.out.println("nhâp số ảo: ");
    ao = sc.nextInt();
}

public void print() {
    System.out.println("số phức 1 là: " +thuc+ "+" +ao+ "i");
}

public soPhuc add(soPhuc sp) {
    soPhuc add = new soPhuc();
        add.thuc = this.thuc + sp.getThuc();
        add.ao = this.ao + sp.getAo();
    return add;
    
}

public soPhuc sub (soPhuc sp) {
    soPhuc sub = new soPhuc();
        sub.thuc = this.thuc - sp.getThuc();
        sub.ao = this.ao - sp.getAo();
    return sub;
}

public soPhuc mul(soPhuc sp) {
    soPhuc mul = new soPhuc();
        mul.thuc = this.thuc*sp.getThuc() - this.ao*sp.getAo();
        mul.ao = this.thuc*sp.getThuc() + this.ao*sp.getAo();
    return mul;
}

public soPhuc div(soPhuc sp) {
    soPhuc div = new soPhuc();
        div.thuc= ((this.thuc*sp.getThuc() + this.ao*sp.getAo())/ (sp.getThuc()*sp.getThuc() + sp.getAo()*sp.getAo()));
        div.ao = (this.ao*sp.getThuc() - sp.getAo()*this.thuc)/ (sp.getThuc()*sp.getThuc() + sp.getAo()*sp.getAo());
    return div;
}


public static void main(String[] args) {
    soPhuc sp = new soPhuc();
    sp.input();
    sp.print();
    
    soPhuc sp2 = new soPhuc();
        sp2.input();
    System.out.print("số phức 2 là: ");
        
        sp2.print();
        
        soPhuc add;
        add = sp.add(sp2);
        System.out.println("tổng của 2 số phức là: ");
        add.print();
        
        soPhuc sub;
        sub = sp.sub(sp2);
        System.out.println("hiệu của 2 số phưc là: ");
        sub.print();
        
        soPhuc mul;
        mul = sp.mul(sp2);
        System.out.println("tích hai số phức là: ");
        mul.print();
        
        soPhuc div;
        div = sp.div(sp2);
        System.out.println("thương 2 số phức là: ");
        div.print();
}
}
