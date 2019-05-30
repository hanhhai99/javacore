/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapbuoi13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class JDBConnector {
    public Connection getConnect() throws ClassNotFoundException, SQLException{
        
            Class.forName("com.mysql.jdbc.Driver");
            String conStr = "jdbc:mysql://localhost:8080/csdl";
            Connection con = DriverManager.getConnection(conStr, "root","root@123");
            return con;
        
        
    }
    
}
