/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

/**
 *
 * @author ASUS
 */
public class tamgiacvuong extends tamgiac {
    
    public tamgiacvuong() {
      super();   
    }
    
    public tamgiacvuong(int canh, int goc) {
        super( canh, goc);
    }
    
    @Override
    
    public void input() {
       super.input();
       
       
    }
    
    @Override
    
    public void print() {
        super.print();
        if(goc == 90) System.out.println("đây là tam giác vuông");
        else System.out.println("đây không phải là tam giác vuông");
    }
   
}
