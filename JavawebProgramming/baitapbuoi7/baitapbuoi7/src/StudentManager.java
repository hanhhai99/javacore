/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class StudentManager extends Manager {

    private static final int max = 20;
   

    public StudentManager() {
        this.list = new Student[max];
    }

    @Override
    public void add() {
        Student s = new Student();
        s.input();
        this.list[this.curr] = s;
        this.curr++;
    }
    @Override
    public void search(String name) {
         System.out.println("====kẾT QUẢ TÌM KIẾM====");
        boolean check = false;
        for(int i =0; i<list.length; i++){
            if(list[i] == null) continue;
            
            if(this.list[i].getName().equals(name)){
                System.out.println(this.list[i]);
                check = true;
                break;
            }
        }
        System.out.println("không tìm thấy");
    }
    

    @Override
    public void show() {
        System.out.println("===in ra danh sách===");
        for(int i =0; i<list.length; i++) {
            if(this.list[i] == null) continue;
            System.out.println(this.list[i]);
        }
    }

    
    
}
