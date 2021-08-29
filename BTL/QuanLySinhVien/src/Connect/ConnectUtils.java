/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ConnectUtils {
       public static Connection connect(){
        Connection conn = null;
        try {
           conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=QuanLySinhVien;integratedSecurity=true");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
        
}