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
public class Store {
    private Product[] product;

    public Store() {
    }

    public Store(Product[] product) {
        this.product = product;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }
    
    Scanner sc = new Scanner(System.in);
    int number = 0;
    
    public void addProduct() {
        Product p;
        
        int choice = sc.nextInt();
        System.out.println("Thêm Camera hay thêm SmartPhone: (1/0)");
        if(choice == 1) p = new Camera();
        else p = new SmartPhone();
        p.addNew();
        
        if(number >= product.length){
            System.out.println("không thêm được");
            return;
        }
        
        else {
            product[number] =p;
            number ++;
        }
    }  
      
    public void listProduct() {
            System.out.println("=====Danh Sach=====");
        for(Product p: product){
            if(p == null)
                break;
            System.out.println(p);
        }
        
    }
    
    public void search(String name) {
       
         for(Product p : product){
            if(p == null)
                break;
            if(p.getName().equals(name)){
                System.out.println(p);
                return ;
            }
        }
        System.out.println("không tìm thấy");
    }

   
 
    }
    

