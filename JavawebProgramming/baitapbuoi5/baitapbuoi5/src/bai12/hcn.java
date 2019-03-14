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
public class hcn extends hbh {
    private int goc;
    
    public hcn () {
        super();
    }
    
    public hcn (int goc,int canhb1, int canhb2, int canhd1, int canhd2) {
        super(canhb1, canhb2, canhd1, canhd2);
        this.goc = goc;
    }
    
  
    
    @Override
    
    public void print() {
        super.print();
    
    if(goc == 90) {
    System.out.println("đây là hình chữ nhật");
    }
    else  {
            System.out.println("đây không phải là hình chữ nhật");
    }

    
}
    
   
    public int chuvi(int hcn) {
        int C=0;
        System.out.println("chu vi hình chữ nhật là: " );
        C=(canhb1+canhb2+canhd1+canhd2);
        return C;
    }
    
    public int dientich(int hcn) {
        int S=0;
        System.out.println("diện tích hình chữ nhật này là: " );
        S=+(canhb1*canhd1);
        return S;
    }
    
}
