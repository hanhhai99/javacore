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
public class Camera extends Product {
    private boolean hasWifi;

    public Camera( ) {
       
    }

    public Camera(boolean hasWifi, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasWifi = hasWifi;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    @Override 
    public void addNew() {
        super.addNew();
        int choice = sc.nextInt();
        System.out.println("có wifi hay không: (1/0)");
        if(choice == 1) hasWifi = true;
        else hasWifi = false;
    }
    
}
