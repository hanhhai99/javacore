/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class main {
   
     Scanner sc = new Scanner(System.in); 
     System.out.println("Nhập số x:");
        snt snt = new snt();
        
        int x = sc.nextInt();
        snt.snt(int x);
        
        if(snt.timsnt() ==0) System.out.println("a không xác định nên bỏ");
        else System.out.println("Số nguyên tố tiếp theo của a là "+snt.timsnt());
}
