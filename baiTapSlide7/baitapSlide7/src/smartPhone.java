
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
public class smartPhone extends product {
     
     
    private boolean hasCam;
    private int sim;
    private boolean hasCame;
        
    public smartPhone() {
        super();
    }
    
    public smartPhone(int id, String name, double price, int quantity, boolean hasCam, int sim) {
        super(id, name, price, quantity);
        this.hasCam = hasCam;
        this.sim = sim;
    }
    
    public int getSim() {
        return sim;
    }
    
    public void setSim(int sim) {
        this.sim=sim;
    }
    
    public boolean getHasCam() {
        return true;
    }
    
    public void setHasCam(boolean hasCam) {
        this.hasCam=hasCam;
    }
@Override
    public void addNew(){
        super.addNew();
        Scanner sc = new Scanner(System.in);
        System.out.print("kiem tra hasCame:(1/0)");
        int choice = sc.nextInt();
        this.hasCame = choice == 1?true:false;
        System.out.print("nhap so sim:");
        this.sim = sc.nextInt();
    }
    @Override
    public void prinInfo(){
        super.prinInfo();
        if(this.hasCame ==true) 
            System.out.println("co camera");
        else {
            System.out.println("khong co camera");
            System.out.println("sim: "+ sim);
    }
    }   
}
