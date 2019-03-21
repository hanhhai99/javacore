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
public class StudentManager {
    
    private static final int max = 20;
    private int currentQuantity ;
    private Student [] listStudent;

    public StudentManager() {
        
    }

    public StudentManager(Student[] listStudent, int currentQuantity) {
        this.listStudent = new Student[max];
        this.currentQuantity = 0;
    }

    public Student[] getListStudent() {
        return listStudent;
    }

    public void setListStudent(Student[] listStudent) {
        this.listStudent = listStudent;
    }
    
    public boolean add(Student s) {
        if(currentQuantity < StudentManager.max) {
        this.listStudent[this.currentQuantity] = s;
        this.currentQuantity ++;
        return true;
        }
        else{
            return false;
        }
      
    }
    
    public void search(String name) {
        boolean found = false;
        for(int i =0;i<listStudent.length;i++) {
            Student temp = this.listStudent[i];
            if(temp == null) continue;
            if(temp.getName().equals(name)) {
                System.out.println(temp);
                found = true;
            }
        }
        if(found) {
            System.out.println("không tìm thấy");
        }
        
        
    }
    
    public void list() {
        for(Student student : listStudent) {
            if(student !=null){
            System.out.println(student);
            
            }
        }
        
        
        
    }
    
    public void list(boolean order) {
        if(order) {
           
            //sap xep tang dan
            for (int i = 0; i < this.listStudent.length -1; i++) {
                for (int j = 0; j < this.listStudent.length; j++) {
                   if(this.listStudent[i] == null || this.listStudent[j] == null); 
                   if(this.listStudent[i].getName().compareTo(this.listStudent[i].getName())>0)
                        
                        Student temp = this.listStudent[i];
                        this.listStudent[i] = this.listStudent[j];
                        this.listStudent[j] = temp;
                }
                
            }
        }
        else {
            for (int i = 0; i < this.listStudent.length -1; i++) {
                for (int j = 0; j < this.listStudent.length; j++) {
                    if(this.listStudent[i].getName().compareTo(this.listStudent[i].getName())<0)
                        
                        Student temp = this.listStudent[i];
                        this.listStudent[i] = this.listStudent[j];
                        this.listStudent[j] = temp;
        }
    }
    
        }
        
        for(Student student : listStudent) {
            System.out.println(student);
        }
    
   
    
    
    }
    
}
