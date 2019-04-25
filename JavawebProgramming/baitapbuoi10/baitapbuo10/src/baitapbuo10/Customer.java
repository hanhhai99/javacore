/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuo10;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class Customer implements Serializable {
    
    private int id;
    private int age;
    private String name;
    private String add;

    public Customer() {
    }

    public Customer(int id, int age, String name, String add) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.add = add;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdd(String add) {
        this.add = add;
    }
    
    
    @Override
    public String toString() {
        return "Customer{" + "ten: " +name+ ", dia chi: " +add+ ", tuoi" +age+ ')';
    }
    
     @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        final Customer other = (Customer) obj;
        if(this.id != other.id) return false;
        return false;
    }
    
}
