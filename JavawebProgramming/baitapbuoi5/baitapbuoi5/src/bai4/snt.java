/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author ASUS
 */
public class snt {
    
    private int a;
    
public snt() {
    
}

public snt(int a) {
    this.a = a;
}

public int getA() {
    return a;
}
public void setA(int a) {
    this.a=a;
}

public boolean nsnt(int x) {
    if(x<2) return false;
    for(int i=2; i<=Math.sqrt(x); i++) {
        if(x%i==0) return false;
    }
    return true;
        
}

public snt(int x){
if(nsnt(x) == true ) 
        { 
            a= x;
            System.out.println("Số nguyên tố a: "+a);
        }
        else System.out.println("Số đó không phải số nguyên tố ");
        
    }
    public int timSoNguyenToTiepTheo(){
        if(a!=0){
            int i = a+1;
            while(i>0){
                if(nsnt(i)== true){
                    break;
                }
                else i++;
            }
        return i;
        }
        return 0;
    }

    
    
    
}
