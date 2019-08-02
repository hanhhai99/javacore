/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Student {
    private int stt;
    private String name;
    private String major;
    private String lop;

    public Student() {
    }

    public Student(int stt, String name, String major, String lop) {
        this.stt = stt;
        this.name = name;
        this.major = major;
        this.lop = lop;
    }

    public int getStt() {
        return stt;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getLop() {
        return lop;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "stt=" + stt + ", name=" + name + ", major=" + major + ", lop=" + lop + '}';
    }

    
    
    
}
