
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
public class store {
     
    
     public product[] products;
     
    public void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong san pham: ");
        int n = sc.nextInt();
        products = new product[n];
        for(int i=0;i<n;i++){
            products[i] = addProduct();
        }
 }
    
    
   public void prinInfo(){
        for(int i=0;i<products.length;i++){
            products[i].prinInfo();
        }
    }
    
    public product addProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("loai san pham:");
        System.out.println("1.SmartPhone");
        System.out.println("2.Camera");
        System.out.println("chon: ");
        int choice = sc.nextInt();
        sc.nextLine();
        product product = null;
        switch(choice){
            case 1:{
                product = new smartPhone();
                break;
            }
            case 2:{
                product = new camera();
                break;
            }
        }
        product.addNew();
        return product;
    }
    public void search(String name){
        for(int i=0;i<products.length;i++){
            if(products[i].getName().equals(name))
                products[i].prinInfo();
            else System.out.println("khong co san pham can tim");
        }
                
    }

    
    
    
}
