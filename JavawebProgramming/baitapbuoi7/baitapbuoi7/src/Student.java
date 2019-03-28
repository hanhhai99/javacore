
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
public class Student extends Person {
    
    private String email;

    public Student() {
    }

    public Student(String email, String id, String name) {
        super(id, name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    @Override 
    public void input() {
        super.input();
        System.out.println("nhập email: ");
        email = sc.nextLine();
    }
}
