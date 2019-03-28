
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
public class Employee extends Person {
    private double salary;

    public Employee() {
        
    }

    public Employee(double salary, String id, String name) {
        super(id, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    @Override
    public void input() {
        super.input();
        System.out.println("Nhập số lương: ");
        salary = sc.nextDouble();
    }
}
