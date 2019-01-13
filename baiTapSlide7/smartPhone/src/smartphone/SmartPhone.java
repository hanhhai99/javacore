/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartphone;

/**
 *
 * @author ASUS
 */
public class SmartPhone {

    private int sim;
    private boolean hasCam;
    
    public SmartPhone() {
        super();
    }
    
    public SmartPhone(int sim, boolean hasCam, int id, String name, int quantity, int price) {
        super(id, name, price, quantity);
        this.sim = sim;
        this.hasCam = hasCam;
    }
    
    public int getSim() {
        return sim;
        
    }
    
    public void setSim( int sim) {
        this.sim=sim;
    }
    
    public boolean getHasCam() {
        return true;
    }
    
    public void setHasCam(boolean hasCam) {
        this.hasCam = hasCam;
    }
    @Override
    public void addNew(){
        super.addNew();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hasCame: (1/0)");
        int choice = sc.nextInt();
        this.hasCamera = choice == 1 ? true : false;
        System.out.println("Nhap sim: ");
        int sim = sc.nextInt();
    }
}
