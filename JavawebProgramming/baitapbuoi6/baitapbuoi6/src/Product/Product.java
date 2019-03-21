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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public Scanner sc = new Scanner(System.in);
    
    public void addNew() {
        System.out.println("nhập id: ");
        id = sc.nextInt();
        System.out.println("nhập tên: ");
        name = sc.nextLine();
        System.out.println("nhập giá: ");
        price = sc.nextDouble();
        System.out.println("nhập số lượng: ");
        quantity = sc.nextInt();
    }
    
}
