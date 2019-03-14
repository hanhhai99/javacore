
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
public class MyDate {
    private int day;
    private int month;
    private int year;
    
public MyDate() {
    
}

public MyDate (int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
}

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

public boolean checkYear(int year) {
    
     if((year%400==0) || (year%4==0 && year%100==0)) return true;
     else return false;
} 

public int checkMonth() {
    
    int max=0;
    if(month==1 || month==3 || month==5|| month==7|| month==8|| month==10|| month==12){
        return max=31;
    }
    if(month==2) {
        if(checkYear(year)==true) {
            return max = 29;
        }
        else {
            return max = 28;
        }
    }
    else{
        return max = 30;
    }
       
}
    
    
    
    
public void input() {
    Scanner sc = new Scanner(System.in);
    
    day = sc.nextInt();
    
    System.out.println("nhập tháng: ");
    month = sc.nextInt();
    System.out.println("nhập năm: ");
    year = sc.nextInt();
}

public void print() {
    System.out.println("ngày" +day+ "tháng" +month+ "năm" +year);
}

public void sum() {
    
   
            
    
}


 public static void main(String[] args) {
    MyDate md = new MyDate();
    md.input();
    md.print();
 }   
}
