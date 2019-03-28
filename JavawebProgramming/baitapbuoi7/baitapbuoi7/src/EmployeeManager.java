/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class EmployeeManager extends Manager {

    @Override
    public void add() {
        Employee e = new Employee();
        e.input();
        this.list[this.curr] = e;
        this.curr++;
        }

    @Override
    public void search(String name) {
        System.out.println("====TÌM KIẾM====");
        boolean check = false;
        for (int i = 0; i < list.length; i++) {
            if(list[i] ==null) continue;
            if(this.list[i].getName().equals(name)) {
                System.out.println(this.list[i]);
                check = true;
                break;
            }
          
        }
        System.out.println("không tìm thấy");
    }
     @Override
    public void show() {
         System.out.println("===IN RA KẾT QUẢ===");
         for (int i = 0; i < list.length; i++) {
             if(this.list[i] == null) continue;
             System.out.println(this.list[i]);
             
         }
        }
}
