/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author ASUS
 */
public class Student {
    private String name;
    private String roll;
    private int date;

    public Student() {
    }

    public Student(String name, String roll, int date) {
        this.name = name;
        this.roll = roll;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getRoll() {
        return roll;
    }

    public int getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public void setDate(int date) {
        this.date = date;
    }
    
    
}
