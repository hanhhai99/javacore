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
public class tamgiaccan extends tamgiacvuong {
    public tamgiaccan() {
        super();
    }
    
    public tamgiaccan(int canh, int goc) {
        super(canh, goc);
    }
    
    @Override
    
    public void input() {
        super.input();
     
    }
    
    public void print() {
        super.print();
        if(canh == canh) System.out.println("đây là tam giác cân");
        else System.out.println("không phải là tam giác cân");
    }
            
    
}
