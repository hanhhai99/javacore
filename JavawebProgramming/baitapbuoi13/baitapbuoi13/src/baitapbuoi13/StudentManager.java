/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class StudentManager {
    Connection con;
    
    public StudentManager() throws ClassNotFoundException,SQLException {
        JDBConnector db = new JDBConnector();
        this.con = db.getConnect();
    }
    
    public Student login(String email, String pass) throws SQLException {
        String query = "select * from Students where email = ? and pass = ?";
        PreparedStatement pr = this.con.prepareStatement(query);
        pr.setString(0, email);
        pr.setString(1, pass);
        
        ResultSet rs = pr.executeQuery();
        Student s = null;
        if(rs.next()) {
            s = new Student(rs.getInt("id"), rs.getString("name"),rs.getString("email"),rs.getString("pass"));
            
        }
        
        return s;
        
    }
    
    public int addAnswer(Student s, Question q, String answer) throws SQLException {
        String query = "insert into student_questions values (?,?,?)";
            PreparedStatement pr = this.con.prepareStatement(query);
            pr.setInt(1, s.getId());
            pr.setInt(2, q.getId());
            pr.setString(3,answer);
            return pr.executeUpdate();
        
    }
    
    public void printResult(){
        
    }
    
}
