/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuo10;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        CustomerManager cm = new CustomerManager();
        
        while(true) {
            System.out.println("=====MENU=====");
            System.out.println("1. Load");
            System.out.println("2. ADD");
            System.out.println("3. Save");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.println("CHOICE: ");
            int choice = Integer.parseInt(sc.nextLine());
            
            switch(choice) {
                case 1: 
                    System.out.println("File Path: ");
                    String Path = sc.nextLine();
                    if(cm.load(Path)) {
                        System.out.println("ok");
                    }
                    else {
                        System.out.println("Error");
                    }
                    break;
                        
                case 2: 
                    cm.add();
                    break;
                    
                case 3:
                    if(cm.save()) {
                        System.out.println("ok");
                    }
                    else {
                        System.out.println("Error");
                    }
                    break;
                    
                case 4:
                    System.out.println("ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    Customer cust = cm.search(id);
                    if(cust == null) {
                        System.out.println("not found");
                    }
                    else {
                        System.out.println(cust);
                    }
                    
                case 5:
                    System.exit(0);
                default:
                    System.out.println("not valid");
            }
            
        }
    }
}
