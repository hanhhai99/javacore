/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi13;

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
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("    QUIZ ONLINE");
            System.out.println("==============");
            System.out.print("nhap email: ");
            String email = sc.nextLine();
            System.out.print("nhap pass: ");
            String pass = sc.nextLine();
            
            StudentManager sm = new StudentManager();
            boolean checkLogin = sm.login(email, pass);
            if(checkLogin) {
                System.out.println("succes");
                
            }
            
            else {
                System.out.println("fail!");
            }
                    
            }catch(Exception e) {
                
            e.printStackTrace();
        }
    }
    
}
    