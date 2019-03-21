/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi6.student;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main (String [] args) {
        StudentManager manager = new StudentManager();
        manager.add(new Student("lan", "lanact", 22));
        manager.add(new Student("thu", "thuact", 19));
        manager.add(new Student("ha", "haact", 20));
    
        manager.list();
        
        System.out.println("---tim kiem -----");
        manager.search("ha");
        
        System.out.println("----Sap Xep----");
        manager.list(true);
    }
}
