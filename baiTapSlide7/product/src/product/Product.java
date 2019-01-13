/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Product {

        private int id;
        private String name;
        private double price;
        private int quantity;
        
    public Product() {
        
    }
    
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
               
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantify(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    
    public void addNew(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ID: ");
        id = sc.nextInt();
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhập giá: ");
        price = sc.nextDouble();
        System.out.println("Nhập số lượng: ");
        quantity = sc.nextInt();
    }
}
