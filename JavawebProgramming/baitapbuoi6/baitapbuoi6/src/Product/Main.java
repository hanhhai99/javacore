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
public class Main {
    public static void main(String[] args) {
        Product [] product = new Product[10];
        Scanner sc = new Scanner(System.in);
        Store st = new Store();
        int choice = 0;
        do{
            System.out.println("=====MENU=====");
            System.out.println("1. AddProduct");
            System.out.println("2. ListProduct");
            System.out.println("3. SearchProduct");
            System.out.println("4. Exit");
            System.out.println("-----mời bạn chọn-----");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    st.addProduct();
                    break;
                
                case 2:
                    st.listProduct();
                    break;
                    
                case 3: 
                    System.out.println("Nhập tên");
                    String name = sc.nextLine();
                    st.search(sc.nextLine());
            }
        }
        while (choice !=4);
        
        
    }
}
    

