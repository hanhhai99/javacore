
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class product  {
     
    private int id;
    private String name;
    private double price;
    private int quantity;
    
    public product () {
    
    }
    
    
    public product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public int getId()
    {
        return id;
    }        
     public void setId(int id) {
         this.id = id;
     }
     public String getName()
    {
        return name;
    }        
     public void setName(String name) {
         this.name = name;
     }
     public double getPrice()
    {
        return price;
    }        
     public void setPrice(double price) {
         this.price = price;
     }
     public int getQuantity()
    {
        return quantity;
    }        
     public void setQuantity(int Quantity) {
         this.quantity = quantity;
     }
    
     public void addNew() {
         Scanner sc = new Scanner(System.in);
         System.out.print("nhap id: " );
         id = sc.nextInt();
         System.out.print("nhap name: " );
         name = sc.nextLine();
         System.out.print("nhap price: " );
         price = sc.nextDouble();
         System.out.print("nhap quantity: " );
         quantity = sc.nextInt();
     }   
      public void prinInfo(){
        System.out.println("Ma san pham: "+ getId());
        System.out.println("Ten san pham: "+getName());
        System.out.println("Gia san pham: "+getPrice());
        System.out.println("So luong: " + getQuantity());
    }   

    
    
}
