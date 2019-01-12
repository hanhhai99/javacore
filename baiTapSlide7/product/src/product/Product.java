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
public static void main () {
        public class Product {
            private int id;
            private String name;
            private double price;
            private int quantity;
    
        public Product(){
    
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

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        public void addNew(){
            Scanner sc= new Scanner(System.in);
                System.out.print("Nhap ma san pham: ");
                setId(sc.nextInt());
                System.out.print("Nhap ten san pham: ");
                setName(sc.nextLine());
                System.out.print("Nhap gia san pham: ");
                setPrice(sc.nextDouble());
                System.out.print("Nhap so luong san pham: ");
                setQuantity(sc.nextInt());
        }
  
}
    class SmartPhone extends Product{
    private boolean hasCamera;
    private int sim;
    public boolean getHasCamera(){
        return true;
    }
    public SmartPhone(){
        super();
    }
    public SmartPhone(int id, String name, double price, int quantity, boolean hasCamera, int sim ){
        super(id,name,price,quantity);
        this.hasCamera=hasCamera;
        this.sim = sim;
    }
    @Override
    public void addNew(){
        super.addNew();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hasCamera: (1/0)");
        int choice = sc.nextInt();
        this.hasCamera = choice == 1 ? true : false;
        System.out.println("Nhap sim: ");
        int sim = sc.nextInt();
    }
    
}
}
    

