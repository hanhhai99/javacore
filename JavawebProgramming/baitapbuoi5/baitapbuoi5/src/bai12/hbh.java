/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

/**
 *
 * @author ASUS
 */
public class hbh extends dagiac {
    
    public hbh() {
        super();
    }
    
    public hbh(int canhb1, int canhb2, int canhd1, int canhd2) {
        super(canhb1, canhb2, canhd1, canhd2);
    }
    
   @Override
    
    public void print() {
        super.print();
        if(canhb1 == canhb2 && canhd1 == canhd2){
            System.out.println("đây là hình bình hành");
        }
        else {
            System.out.println("đây là hình tứ giác thường");
        }
        
    }
    
    public int chuvi(int hbh) {
        int C =0;
            System.out.println("chu vi hình bình hành là: " );
            C=(canhb1+canhb2+canhd1+canhd2);
            return C;
    }
    
   
}
