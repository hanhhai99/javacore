
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
public class main {
    
    public static void main(String[] args) {
        
        
        System.out.println("menu");
        System.out.println("1.addProduct");
        System.out.println("2.list​ ​Product ");
        System.out.println("3.search ");
        System.out.println("4.exit ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        store st = new store();
        switch (choice) {
            case 1:
                st.addProduct();
                break;
            case 2:
                st.printInfo();
                break;
            case 3:
                st.search();
                break;
            case 4:
                System.out.print("exit");
                break;
        }
    }
    
          
    
}
