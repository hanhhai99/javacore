/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StudentManager mn = new StudentManager();
    Scanner sc = new Scanner(System.in);
    while(true) {
            System.out.println("====MENU====");
            System.out.println("1. ADD");
            System.out.println("2. SEARCH");
            System.out.println("3. DELETE");
            System.out.println("4. SAVE");
            System.out.println("5. READ");
            System.out.println("6. EXIT");
            System.out.println("choice");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice) {
                case 1:
                    mn.add();
                    break;
                case 2:    
                    String name = sc.nextLine();
                    mn.search(name);
                    break;
                case 4:
                    
                   
                    
            }
}
    }
    
}
