
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
public class Menu {
    private Manager manager = null;

    public Menu(Manager manager) {
        this.manager = manager;
    }
    
    public void display() {
        int choice = 0;
        do{
            System.out.println("=====MENU=====");
            System.out.println("1. ADD");
            System.out.println("2. SHOW");
            System.out.println("3. SEARCH");
            System.out.println("4. EXIT");
            System.out.println("Mời bạn chọn: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    this.manager.add();
                    break;
                case 2:
                    System.out.println("Nhập tên: ");
                    String name = sc.nextLine();
                    this.manager.search(name);
                    break;
                case 3:
                    this.manager.show();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while(choice<4 && choice>0);
    
        }
    }
    
    
    

