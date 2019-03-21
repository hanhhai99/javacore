/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SmartPhone extends Product {
    public boolean hasCam;
    public int sim;

    
    
    public SmartPhone() {
       
    }

    public SmartPhone(boolean hasCam, int sim, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasCam = hasCam;
        this.sim = sim;
    }

    public boolean isHasCam() {
        return hasCam;
    }

    public int getSim() {
        return sim;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setHasCam(boolean hasCam) {
        this.hasCam = hasCam;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
     @Override
     public void addNew() {
         super.addNew();
         int choice = sc.nextInt();
         System.out.println("Nhập số sim: ");
         sim = sc.nextInt();
         
         System.out.println("Có Camera hay không: (1/0)");
         if(choice ==1) hasCam = true;
      }
 
}
