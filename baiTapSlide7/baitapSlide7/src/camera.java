
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
public class camera extends product {
     public static void main(String[] args) {
        // TODO code application logic here
    }
     
     private boolean wifi;
    
    
    public camera () {
        super();
    }
    
    public camera(int id, String name, double price, int quantity, boolean wifi) {
        super(id, name, price, quantity);
        this.wifi = wifi;
    }
    
    public boolean getWifi() {
        return wifi;
    }
    
    public void setWifi( boolean wifi){
        this.wifi = wifi;
    }
    
@Override
    
    public void addNew() {
        super.addNew();
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiểm tra wifi:(1/0)");
        int choice = sc.nextInt();
        this.wifi = choice == 1?true:false;
    }
    
@Override
public void prinInfo(){
        super.prinInfo();
        if(this.wifi == true) System.out.println("Co wifi");
        else System.out.println("ko co wifi");
    }
    
     
    
}
