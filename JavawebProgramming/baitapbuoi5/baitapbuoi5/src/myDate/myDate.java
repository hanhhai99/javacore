/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myDate;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class myDate {
    private int day;
    private int month;
    private int year;
    
    public myDate() {
        
    }
    
    public myDate(int day, int month, int year) {
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
        if((year%4==0 & year%100==0) && (year%400==0)) return true;
        else return false;
    }
    
    public int checkMonth(int month,int day) {
        int max =0;
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
            return max =31;
        if(month ==2) {
            if(checkYear(year)==true) return max =29;
            else return max = 28;
        }
        else return max = 30;
    }
    
    Scanner sc = new Scanner(System.in);
    public void input() {
        System.out.println("nhập năm: ");
        year = sc.nextInt();
        
       do{
            System.out.println("Nhập tháng: ");
            month = sc.nextInt();
        }while(this.month <=0 || this.month >12 );
         
        do{
            System.out.println("Nhập ngày:");
            day = sc.nextInt();
        }while(this.day <=0 || this.day > checkMonth(month, year));
         
            
        
    }
    
    public void print() {
        System.out.println("ngày " +day+ " tháng " +month+ " năm " +year);
    }
    
    
    public static void main(String[] args) {
        myDate m = new myDate();
        m.input();
        m.print();
        m.checkMonth(0, 0);
        m.checkYear(0);
        
        
        
    }

}